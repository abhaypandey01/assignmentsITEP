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

        Book[] books = new Book[5];
        Library lib = new Library();

        for(int i = 0; i < 5; i++){
            System.out.println("Enter title, author and isbn of book "+ (i+1));
            String title = sc.nextLine();
            String author = sc.nextLine();
            int isbn = sc.nextInt();
            sc.nextLine();
            books[i] = new Book(title, author, isbn);
            lib.addBook(books[i]);
        }

        System.out.println("Enter the book index you want to remove: ");
        String index = sc.next();

        lib.displayAllDetails();

        for(int i = 0; i < 5; i++){
            if((i+1) == index) lib.removeBook(books[i]);
        }

        System.out.println("Library after removing the book : ");

        lib.displayAllDetails();

    }
}