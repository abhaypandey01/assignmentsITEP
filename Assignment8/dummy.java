import java.util.ArrayList;

class Library{
    ArrayList<Book> booklist = new ArrayList<Book>();

    public void addBook(Book b){
        booklist.add(b);

    }

    public void removeBook(Book b){
        booklist.remove(b);
    }

    public void getBooks(){
        System.out.println("-----Welcome to Library-------");
        for(Book element : booklist){
            System.out.println(element.display());
        }
    }
 }

class Book{
    private String title;
    private String author;
    private int isbn;

    public Book(){}

    public Book(String title, String author, int isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;

    }

    public void setTitle(String title){
    this.title = title;
    }

    public String display(){
        return title+" : "+author+" : "+isbn;
    }
}

class Test{
    public static void main(String args[]){
        Book obj1 = new Book("Art of war", "tsun zu", 1234);
        Book obj2 = new Book("R dad P dad", "r k", 1235);
        Book obj3 = new Book("Man of steel", "dc comic", 1236);

        Library lib = new Library();

        lib.addBook(obj1);
        lib.addBook(obj2);
        lib.addBook(obj3);
        lib.getBooks();
        lib.removeBook(obj3);
        lib.getBooks();

    }
}