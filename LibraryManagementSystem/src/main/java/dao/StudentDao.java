package dao;

import entity.Book;
import entity.Librarian;
import entity.Student;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HBUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDao {
    private static final SessionFactory sessionfactory = HBUtil.getSessionFactory();

    public static boolean create(Student student, int id){
        Transaction tx = null;
        Librarian librarian = null;
        try(Session session = sessionfactory.openSession()){
            tx =  session.beginTransaction();
            librarian = session.get(Librarian.class, id);
            if(librarian == null){return false;}
            librarian.getStudents().add(student);
            student.setLibrarian(librarian);
            session.persist(student);
            tx.commit();
            return true;
        } catch (Exception e) {
            if(tx != null){
                tx.rollback();
            }
            throw new RuntimeException(e);
        }
    }

    public static boolean update(int id){
        Transaction tx = null;
        try(Session session = sessionfactory.openSession();
            Scanner sc =  new Scanner(System.in);){
            tx  =  session.beginTransaction();
            Student student = session.get(Student.class, id);
            System.out.println("Enter updated name: ");
            student.setName(sc.next());
            System.out.println("Enter updated email: ");
            student.setEmail(sc.next());
            System.out.println("Enter updated batch: ");
            student.setBatch(sc.next());
            session.persist(student);
            tx.commit();
            return true;
        } catch (Exception e) {
            if(tx != null){
                tx.rollback();
            }
            throw new RuntimeException(e);
        }
    }

    public static boolean delete(int id){
        Transaction tx = null;
        try(Session session = sessionfactory.openSession()){
            tx = session.beginTransaction();
            Student student = session.get(Student.class, id);
            session.remove(student);
            tx.commit();
            return true;
        }catch (Exception e){
            if(tx != null){
                tx.rollback();
            }
            e.printStackTrace();
            return false;
        }
    }

    public static Student get(int id){
        Transaction tx = null;
        try(Session session = sessionfactory.openSession()){
            tx = session.beginTransaction();
            Student student = session.get(Student.class, id);
            tx.commit();
            return student;
        }catch (Exception e){
            if(tx != null){
                tx.rollback();
            }
            e.printStackTrace();
            return null;
        }
    }

    public static List<Student> getAll(){
        Transaction tx = null;
        List<Student> students = new ArrayList<>();
        try(Session session = sessionfactory.openSession()){
            tx =  session.beginTransaction();
            TypedQuery<Student> query = session.createQuery("from Student", Student.class);
            students = query.getResultList();
            tx.commit();
            return students;
        }catch (Exception e){
            if(tx != null){
                tx.rollback();
            }
            e.printStackTrace();
            return null;
        }
    }

    public static boolean updateByName(String name){
        Transaction tx = null;
        try(Session session = sessionfactory.openSession();
            Scanner sc =  new Scanner(System.in);){
            tx  = session.beginTransaction();
            TypedQuery<Student> query = session.createQuery("from Student where name=:name", Student.class);
            Student student = query.setParameter("name", name).getSingleResult();
            System.out.println("Enter updated name: ");
            student.setName(sc.next());
            System.out.println("Enter updated email: ");
            student.setEmail(sc.next());
            System.out.println("Enter updated batch: ");
            student.setBatch(sc.next());
            session.persist(student);
            tx.commit();
            return true;
        }catch(Exception e){
            if(tx != null){
                tx.rollback();
            }
            e.printStackTrace();
            return false;
        }
    }
}













