package DAO;

import Entity.Course;
import Entity.Student;
import Util.HBUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class CourseDao {
    private static final SessionFactory factory = HBUtil.getFactory();

    public static void create(Course course) {
        Session session = null;
        Transaction tx = null;
        try {
            session = factory.openSession();
            tx = session.beginTransaction();

            session.persist(course);

            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) tx.rollback();
            throw new RuntimeException(e);
        } finally {
            if (session != null) session.close();
        }
    }

    public static Course getById(int id) {
        Session session = null;
        Transaction tx = null;
        try {
            session = factory.openSession();
            tx = session.beginTransaction();

            Course course = session.get(Course.class, id);

            tx.commit();
            return course;
        } catch (Exception e) {
            if (tx != null && tx.isActive()) tx.rollback();
            throw new RuntimeException(e);
        } finally {
            if (session != null) session.close();
        }
    }

    public static List<Course> getAll() {
        Session session = null;
        Transaction tx = null;
        try {
            session = factory.openSession();
            tx = session.beginTransaction();

            String hql = "from Course";
            Query<Course> query = session.createQuery(hql, Course.class);
            List<Course> list = query.getResultList();

            tx.commit();
            return list;
        } catch (Exception e) {
            if (tx != null && tx.isActive()) tx.rollback();
            throw new RuntimeException(e);
        } finally {
            if (session != null) session.close();
        }
    }

    public static void update(Course course) {
        Session session = null;
        Transaction tx = null;
        try {
            session = factory.openSession();
            tx = session.beginTransaction();

            session.merge(course);

            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) tx.rollback();
            throw new RuntimeException(e);
        } finally {
            if (session != null) session.close();
        }
    }

    // Delete course safely (clean up associations first)
    public static void delete(int id) {
        Session session = null;
        Transaction tx = null;
        try {
            session = factory.openSession();
            tx = session.beginTransaction();

            Course course = session.get(Course.class, id);
            if (course != null) {
                // remove mapping from each student
                for (Student s : course.getStudents()) {
                    s.getCourses().remove(course);
                }
                course.getStudents().clear();
                session.remove(course);
            }

            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) tx.rollback();
            throw new RuntimeException(e);
        } finally {
            if (session != null) session.close();
        }
    }
}
