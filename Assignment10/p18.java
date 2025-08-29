import java.util.ArrayList;

class Xyz{
    private ArrayList<Product> plist = new ArrayList<Product>();

    public int totalSpent(){
        int total = 0;
        for(Product p : plist){
            total += p.getQuantity() * p.getPrice();
        }
/* Math.pow(x,y) */
        return total;
    }

    public void addProduct(Product p){
        plist.add(p);
    }

    public void removeProduct(Product p){
        plist.remove(p);
    }

    public void highestPrice(){
        int highest = 0, highestpid = 0;

        for(Product p : plist){
            if(p.getPrice() > highest){
                highest = p.getPrice();
                highestpid = p.getPid();
            }
        }
        System.out.println("The product with highest price is " + highestpid);

    }
}

class Product {
    private int pid;
    private int price;
    private int quantity;

    public Product(int pid, int price, int quantity){
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public int getPid(){
        return pid;
    }

    public int getPrice(){
        return price;
    }

    public int getQuantity(){
        return quantity;
    }
}

class Test{
    public static void main(String args[]){
        Xyz inventory = new Xyz();
        Product p1 = new Product(123, 200, 20);
        inventory.addProduct(p1);

        Product p2 = new Product(124, 300, 10);
        inventory.addProduct(p2);

        Product p3 = new Product(125, 1000, 5);
        inventory.addProduct(p3);

        int total = inventory.totalSpent();
        inventory.highestPrice();
    }
}