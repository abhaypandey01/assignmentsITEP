import java.util.ArrayList;
import java.util.Scanner;

class Library{
    ArrayList<Book> blist = new ArrayList<Book>();

    public void addBook(Book b){
        blist.add(b);
    }

    public void removeBook(Book b){
        blist.remove(b);
    }

    public void displayAllDetails(){
        for(Book book : blist){
            System.out.println(book.displayBookDetails());
        }
        System.out.println("Total books available in the library : "+ blist.size());
    }
}

class Book{
    private String title;
    private String author;
    private int isbn;

    public Book(String title, String author, int isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public Book(){}

    public String displayBookDetails(){
        return title+" : "+author+" : "+isbn;
    }
}

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of books you want to add...");
        int n = sc.nextInt();
        sc.nextLine();

        Book[] books = new Book[n];
        Library lib = new Library();

        for(int i = 0; i < n; i++){
            System.out.println("Enter title, author and isbn of book "+ (i+1));
            String title = sc.nextLine();
            String author = sc.nextLine();
            int isbn = sc.nextInt();
            sc.nextLine();
            books[i] = new Book(title, author, isbn);
            lib.addBook(books[i]);
        }
        lib.displayAllDetails();

        System.out.println("Enter the book index you want to remove: ");
        int index = sc.nextInt();



        for(int i = 0; i < 5; i++){
            if((i+1) == index) lib.removeBook(books[i]);
        }

        System.out.println("Library after removing the book : ");

        System.out.println("Title : Author : ISBN");
        lib.displayAllDetails();

    }
}