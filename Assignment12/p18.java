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

    public int  calculate() throws MaxBooksIssuedException{
        Scanner sc=new Scanner(System.in);
        int res=0;
        for(Arr b : bl){
            
            res=res+b.getpirce();
            try{
                if(b.getpirce()==0)
            {
                // b.setprice(10);
                throw new MaxBooksIssuedException();
            }

            }
            catch(MaxBooksIssuedException e)
            {
                System.out.println("you have a product whose price is null, select y to set default price. ");
                char c=sc.nextLine().charAt(0);
                if(c=='y')
                {
                    b.setprice(10);
                    return calculate();
                }
                else
                {
                    System.out.println("now plase enter the price by yoursely");
                    int n=sc.nextInt();
                    b.setprice(n);
                    return calculate();
                }
            }
        }
        return res;
    }
}

class Product{
    private int price;
    private String name;


    public Product(int price, String name){
        this.price = price;
        this.name = name;
    }
    public Product(String name){
        this.price = price;
        this.name = name;
    }

    public void setprice(int price)
    {
        this.price=price;
    }


    public Product(){}

    public int getpirce(){
        return price;
    }

    public String display(){
        return price+" "+name;
    }
}

class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Product a = new Product(1, "bl");
        Product b = new Product( "arushi" );
        Inventory lib = new Inventory();
        lib.addBook(a);
        lib.addBook(b);

        int i=lib.calculate();
        System.out.println(i);

        
    }
}