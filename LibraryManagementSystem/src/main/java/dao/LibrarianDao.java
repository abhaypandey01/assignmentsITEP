package dao;

import entity.Book;
import entity.Librarian;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HBUtil;
import util.HashPassword;

import java.util.List;
import java.util.Scanner;

public class LibrarianDao {
    private static final SessionFactory sessionfactory = HBUtil.getSessionFactory();

    public static boolean create(Librarian  librarian) {
        Transaction tx = null;
        try(Session session = sessionfactory.openSession()){
            tx =  session.beginTransaction();
            session.persist(librarian);
            tx.commit();
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
            if(tx!=null) tx.rollback();
            return false;
        }
    }

    public static boolean delete(int id) {
        Transaction tx = null;
        try(Session session = sessionfactory.openSession()){
            tx =  session.beginTransaction();
            Librarian lib = session.get(Librarian.class, id);
            session.remove(lib);
            tx.commit();
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
            if(tx!=null) tx.rollback();
            return false;
        }
    }

    public static boolean update(int id) {
        Transaction tx = null;
        try(Session session = sessionfactory.openSession();
            Scanner sc = new Scanner(System.in);){
            tx =  session.beginTransaction();
            Librarian lib = session.get(Librarian.class, id);
            System.out.print("Enter update name: ");
            lib.setUsername(sc.next());
            System.out.print("Enter update email: ");
            lib.setEmail(sc.next());
            System.out.print("Enter update password: ");
            lib.setPassword(sc.next());
            session.persist(lib);
            tx.commit();
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
            if(tx!=null) tx.rollback();
            return false;
        }
    }

    public static boolean verify(Librarian  librarian) {
        Transaction tx = null;
        try(Session session = sessionfactory.openSession()){
            tx =  session.beginTransaction();
            TypedQuery<Librarian>  query = session.createQuery("from Librarian where email=:email", Librarian.class);
            query.setParameter("email", librarian.getEmail());
            Librarian lib = query.getSingleResult();
            boolean status = HashPassword.checkPassword(librarian.getPassword(), lib.getPassword());
            tx.commit();
            return status;
        }
        catch(Exception ex){
            ex.printStackTrace();
            if(tx!=null) tx.rollback();
            return false;
        }
    }

    public static Librarian getLibrarian(int id) {
        Transaction tx = null;
        try(Session session = sessionfactory.openSession()){
            tx =   session.beginTransaction();
            Librarian lib = session.get(Librarian.class, id);
            tx.commit();
            return lib;
        } catch (Exception e) {
            if(tx!=null) tx.rollback();
            throw new RuntimeException(e);
        }
    }

    public static List<Book> getBooks(int id){
//        Transaction tx = null;
        try(Session session = sessionfactory.openSession()){
//            tx =   session.beginTransaction();
            Librarian lib = session.get(Librarian.class, id);
            List<Book> books = lib.getBooks();
            books.size();
            return books;
        } catch (Exception e) {
//            if(tx!=null) tx.rollback();
            throw new RuntimeException(e);
        }
    }
}
