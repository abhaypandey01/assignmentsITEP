import java.util.*;

class MaxBooksIssuedException extends Exception{
    public MaxBooksIssuedException(){
        super("10 wala biscuit kitne ka hai ji");
    }
}

class Library{
    ArrayList<Arr> bl = new ArrayList<Arr>();

    public void addBook(Arr b){
        bl.add(b);
    }

    public void issueBook(int count) throws MaxBooksIssuedException{
        if(count > (bl.size()-1)) throw new MaxBooksIssuedException();
    }

    public void displayBooks(){
        for(Arr b : bl){
            System.out.println(b.display());
        }
    }
}

class Arr{
    private int id;
    private String title;
    private String author;


    public Arr(int id, String title, String author){
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public Arr(){}

    public int getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public String display(){
        return id+" "+title+" "+author;
    }
}

class Test{
    public static void main(String args[]){
        Arr a = new Arr(1, "bl", "pandeyji");
        Arr b = new Arr(2, "arushi", "talwar");
        Library lib = new Library();
        lib.addBook(a);
        lib.addBook(b);

        try{
        int element = 3;
        lib.issueBook(element);
        } catch(MaxBooksIssuedException e){
        System.out.println(e);
        }
    }
}