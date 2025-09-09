import java.util.*;

class MaxBooksIssuedException extends RuntimeException{
    public MaxBooksIssuedException(){
        super("Product with null price found.");
    }
}

class Inventory{
    ArrayList<Arr> bl = new ArrayList<Arr>();

    public void addBook(Arr b){
        bl.add(b);
    }

    // public void issueBook(int count) throws MaxBooksIssuedException{
    //     // if(count > (bl.size()-1)) throw new MaxBooksIssuedException();
    // }

    public int  calculate() throws MaxBooksIssuedException{
        int res=0;
        for(Arr b : bl){
            
            res=res+b.getpirce();

            // System.out.println(b.display());
            if(b.getpirce()==0)
            {
                b.setprice(10);
                throw  new MaxBooksIssuedException();
                // return 0;

            }
            
            
        }
        return res;
    }
}

class Arr{
    private int price;
    private String name;
    // private String author;


    public Arr(int price, String name){
        this.price = price;
        this.name = name;
        // this.author = author;
    }
    public Arr(String name){
        this.price = price;
        this.name = name;
        // this.author = author;
    }
    public void setprice(int price)
    {
        this.price=price;
    }


    public Arr(){}

    public int getpirce(){
        return price;
    }

    // public String getTitle(){
    //     return title;
    // }

    // public String getAuthor(){
    //     return author;
    // }

    public String display(){
        return price+" "+name;
    }
}

class Test{
    public static void main(String args[]){
        Arr a = new Arr(1, "bl");
        Arr b = new Arr( "arushi" );
        Inventory lib = new Inventory();
        lib.addBook(a);
        lib.addBook(b);

        try{
        // int element = 3;
        int res=lib.calculate();
        } catch(MaxBooksIssuedException e){
        // System.out.println(e);
        System.out.println("there is a product is list whose price is null we are setting it to default price");
        int res2=lib.calculate();
        System.out.println(res2);

        }
    }
}