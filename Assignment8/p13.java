import java.util.ArrayList;

class Inventory{
    ArrayList<Product> productList = new ArrayList<Product>();

    public void addProduct(Product p){
        productList.add(p);
    }

    public void removeProduct(Product p){
        productList.remove(p);
    }

    public void checkInventory(){
        if(productList.size() < 5) System.out.println("Inventory running low.");
        else System.out.println("Inventory stocked.");
    }

    public void displayAllProducts(){
        System.out.println("--------Total Product Available "+productList.size()+" -----------");
        for(Product product : productList){
            System.out.println(product.printDetails());
        }
    }
}

class Product{
    private int price;
    private String name;
    // public static cnt = 0;

    public Product(){
        // cnt++;
    }

    public Product(String name, int price){
        this.name = name;
        this.price = price;
        // cnt++;
    }

    public String printDetails(){
        return "Product : "+name+"\t Price : "+price;
    }

}

class Test{
    public static void main(String args[]){
        Product p1 = new Product("Laptop", 45000);
        Product p2 = new Product("TV", 19000);
        Product p3 = new Product("AC", 20000);
        Product p4 = new Product("SmartPhone", 15000);
        Product p5 = new Product("EarBuds", 5000);

        Inventory inv = new Inventory();
        inv.addProduct(p1);
        inv.addProduct(p2);
        inv.addProduct(p3);
        inv.addProduct(p4);
        inv.addProduct(p5);
        inv.displayAllProducts();

        inv.removeProduct(p4);
        inv.checkInventory();
        inv.displayAllProducts();

    }
}