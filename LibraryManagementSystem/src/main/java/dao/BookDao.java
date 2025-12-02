package dao;

import entity.Librarian;
import entity.Book;
import jakarta.persistence.TypedQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HBUtil;

import java.util.List;
import java.util.Scanner;

public class BookDao {
    private static final SessionFactory sessionfactory = HBUtil.getSessionFactory();

    public static boolean create(Book book, int id){
        Transaction tx = null;
        Librarian librarian = null;
        try(Session session = sessionfactory.openSession()){
            tx =  session.beginTransaction();
            librarian = session.get(Librarian.class, id);
            if(librarian == null){return false;}
            librarian.getBooks().add(book);
            book.setLibrarian(librarian);
            session.persist(book);
            return true;
        } catch (Exception e) {
            if(tx != null){
                tx.rollback();
            }
            throw new RuntimeException(e);
        }
    }

    public static boolean delete(int id) {
        Transaction tx = null;
        try(Session session = sessionfactory.openSession()){
            tx =  session.beginTransaction();
            Book book = session.get(Book.class, id);
            session.remove(book);
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
            Book book = session.get(Book.class, id);
            System.out.print("Enter update title: ");
            book.setTitle(sc.next());
            System.out.print("Enter update author: ");
            book.setAuthor(sc.next());
            session.persist(book);
            tx.commit();
            return true;
        }catch(Exception ex){
            ex.printStackTrace();
            if(tx!=null) tx.rollback();
            return false;
        }
    }

    public static List<Book> getBooks() {
        Transaction tx = null;
        try(Session session = sessionfactory.openSession();){
            tx  =  session.beginTransaction();
            TypedQuery<Book> query = session.createQuery("from Book", Book.class);
            List<Book> books = query.getResultList();
            tx.commit();
            return  books;
        } catch (Exception e) {
            if(tx != null){
                tx.rollback();
            }
            throw new RuntimeException(e);
        }
    }

    public static Book getBook(int id) {
        Transaction tx = null;
        try(Session session = sessionfactory.openSession();){
            tx = session.beginTransaction();
            Book book = session.get(Book.class, id);
            tx.commit();
            return book;
        }catch(Exception ex){
            if(tx != null){
                tx.rollback();
            }
            ex.printStackTrace();
            return null;
        }
    }
}
