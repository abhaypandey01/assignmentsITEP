import java.util.ArrayList;
class Library{
    ArrayList<Book> bList = new ArrayList<Book>();

    public void addBook(Book b){
        bList.add(b);
        System.out.println("Book with id " + b.getId() + " is added.");
    }

    public void removeBookById(int id){
        for(Book b : bList){
            if(b.getId() == id){
                bList.remove(b);
            }
        }
        System.out.println("Book with id " + id + " is removed.");
    }

    public void listBooks(){
        for(Book b : bList){
            System.out.println(b.displayBookDetail());
        }
    }
}

class Book{
    /* id title author */
    private int id;
    private String title;
    private String author;

    public Book(){
    }

    public Book(int id, String title, String author){
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String displayBookDetail(){
        return "Id :"+id+"\t\tTitle :"+title+"\t\tAuthor :"+author;
    }

}

class Test{
    public static void main(String args[]){
        Book bk1 = new Book(123, "RDPD", "RK");
        Book bk2 = new Book(124, "TAOF", "T ZU");
        Book bk3 = new Book(135, "MEWI", "MKG");
        String book1 = bk1.displayBookDetail();
        System.out.println(book1);

        Library lib = new Library();
        lib.addBook(bk1);
        lib.addBook(bk2);
        lib.addBook(bk3);
        lib.removeBookById(144);
        lib.listBooks();

    }
}