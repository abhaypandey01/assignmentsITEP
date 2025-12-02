package DAO;

import Entity.Course;
import Entity.Student;
import Util.HBUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class StudentDao {
    private static final SessionFactory factory = HBUtil.getFactory();

    // Create new student (persist a brand new entity)
    public static void create(Student student){
        Session session = null;
        Transaction tx = null;
        try {
            session = factory.openSession();
            tx = session.beginTransaction();
            session.persist(student);
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) tx.rollback();
            throw new RuntimeException(e);
        } finally {
            if (session != null) session.close();
        }
    }

    // Update an existing student (merge is safe for detached instances)
    public static void update(Student student){
        Session session = null;
        Transaction tx = null;
        try {
            session = factory.openSession();
            tx = session.beginTransaction();

            // find existing student by email (if needed)
            String hql = "from Student s where s.email = :email";
            Query<Student> query = session.createQuery(hql, Student.class);
            query.setParameter("email", student.getEmail());
            List<Student> list = query.getResultList();
            Student existing = list.isEmpty() ? null : list.get(0);

            if (existing == null) {
                // nothing to update, maybe create?
                session.persist(student);
            } else {
                // apply changes to managed entity or merge updated detached entity
                existing.setName(student.getName());
//                existing.setAge(student.getAge());
                existing.setEmail(student.getEmail());
                // if caller supplied new courses as detached objects, better to merge them properly
                // for simple case, merge the student object
                session.merge(existing);
            }

            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) tx.rollback();
            throw new RuntimeException(e);
        } finally {
            if (session != null) session.close();
        }
    }

    // Delete student by id. Clean up join-table entries before deletion.
    public static void deleteById(int id){
        Session session = null;
        Transaction tx = null;
        try {
            session = factory.openSession();
            tx = session.beginTransaction();

            Student student = session.get(Student.class, id);
            if (student != null) {
                // remove association from courses (both sides) to avoid FK issues
                for (Course c : student.getCourses()) {
                    c.getStudents().remove(student);
                }
                student.getCourses().clear();
                session.remove(student);
            }

            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) tx.rollback();
            throw new RuntimeException(e);
        } finally {
            if (session != null) session.close();
        }
    }

    // Get student by id (no lazy access after session close!)
    public static Student getById(int id){
        Session session = null;
        Transaction tx = null;
        try {
            session = factory.openSession();
            tx = session.beginTransaction();

            Student student = session.get(Student.class, id);

            tx.commit();
            return student;
        } catch (Exception e) {
            if (tx != null && tx.isActive()) tx.rollback();
            throw new RuntimeException(e);
        } finally {
            if (session != null) session.close();
        }
    }

    // Get all students
    public static List<Student> getAll(){
        Session session = null;
        Transaction tx = null;
        try {
            session = factory.openSession();
            tx = session.beginTransaction();

            String hql = "from Student";
            Query<Student> query = session.createQuery(hql, Student.class);
            List<Student> list = query.getResultList();

            tx.commit();
            return list;
        } catch (Exception e) {
            if (tx != null && tx.isActive()) tx.rollback();
            throw new RuntimeException(e);
        } finally {
            if (session != null) session.close();
        }
    }

    // Search by name (uses like)
    public static List<Student> getByName(String name){
        Session session = null;
        Transaction tx = null;
        try {
            session = factory.openSession();
            tx = session.beginTransaction();

            String hql = "from Student s where s.name like :name";
            Query<Student> query = session.createQuery(hql, Student.class);
            query.setParameter("name", "%" + name + "%");
            List<Student> list = query.getResultList();

            tx.commit();
            return list;
        } catch (Exception e) {
            if (tx != null && tx.isActive()) tx.rollback();
            throw new RuntimeException(e);
        } finally {
            if (session != null) session.close();
        }
    }

    // Enroll student in a course (keep both sides in sync)
    public static void enrollInCourse(int studentId, int courseId){
        Session session = null;
        Transaction tx = null;
        try {
            session = factory.openSession();
            tx = session.beginTransaction();

            Student student = session.get(Student.class, studentId);
            Course course = session.get(Course.class, courseId);

            if (student == null || course == null) {
                throw new RuntimeException("Course or student doesn't exist");
            }

            // prevent duplicate
            if (!student.getCourses().contains(course)) {
                student.getCourses().add(course);
            }
            if (!course.getStudents().contains(student)) {
                course.getStudents().add(student);
            }

            // student is managed, so changes will be flushed; merge is unnecessary here
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) tx.rollback();
            throw new RuntimeException(e);
        } finally {
            if (session != null) session.close();
        }
    }

    // Leave a course (remove association both sides)
    public static void leaveCourse(int studentId, int courseId){
        Session session = null;
        Transaction tx = null;
        try {
            session = factory.openSession();
            tx = session.beginTransaction();

            Student student = session.get(Student.class, studentId);
            Course course = session.get(Course.class, courseId);

            if (student == null || course == null) {
                throw new RuntimeException("Course or student doesn't exist");
            }

            student.getCourses().remove(course);
            course.getStudents().remove(student);

            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) tx.rollback();
            throw new RuntimeException(e);
        } finally {
            if (session != null) session.close();
        }
    }
}
