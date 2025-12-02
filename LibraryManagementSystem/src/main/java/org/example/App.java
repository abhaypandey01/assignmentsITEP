package org.example;

import dao.BookDao;
import dao.LibrarianDao;
import dao.StudentDao;
import entity.Book;
import entity.Librarian;
import entity.Student;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HBUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Librarian dao
//        Librarian librarian = new Librarian();
//        librarian.setUsername("admin");
//        librarian.setPassword("admin");
//        librarian.setEmail("admin@gmail.com");
//        if(LibrarianDao.create(librarian)){
//            System.out.println("Librarian created successfully");
//        }

//        if(LibrarianDao.update(1)){
//            System.out.println("Librarian updated successfully");
//        }

//        if(LibrarianDao.verify(librarian)){
//            System.out.println("Librarian successfully verified");
//        }

//        Librarian lib = LibrarianDao.getLibrarian(1);
//        System.out.println(lib);


        //Book dao
//        Book[] books = new Book[2];
//        books[0] = new Book();
//        books[0].setTitle("Book 1");
//        books[0].setAuthor("Author 1");
//        books[1] = new Book();
//        books[1].setTitle("Book 2");
//        books[1].setAuthor("Author 2");
//        BookDao.create(books[0], 1);
//        boolean flag = BookDao.create(books[1], 1);
//        boolean flag = BookDao.delete(2);
//        boolean flag = BookDao.update(1);
//        if(flag) System.out.println("Book updated successfully");
//        List<Book> books = LibrarianDao.getBooks(1);
//        for(Book book : books) System.out.println(book);
//        Book book = BookDao.getBook(1);
//        System.out.println(book);
//        List<Book> books = BookDao.getBooks();
//        for (Book book : books) System.out.println(book);

        //student dao
//        Student student = new Student();
//        student.setName("Julia");
//        student.setEmail("julia@email.com");
//        student.setBatch("Batch15");
//        if(StudentDao.updateByName("Julia")){
//            System.out.println("Student updated successfully");
//        }

        SessionFactory sf = HBUtil.getSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();
        Query query = session.createQuery("from Book where id=:id", Book.class);
        query.setParameter("id", 1);
        List<Book> books =  query.getResultList();
        Book book = books.isEmpty() ? null : books.get(0);
        System.out.println(book);
        session.getTransaction().commit();
        HBUtil.close();
    }
}
