import java.util.*;

class InsufficientBalance extends Exception{
    public InsufficientBalance(String msg){
        super(msg);
    }
}

class Product{
    private String name;
    private int price;

    public Product(){}

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return name+" $"+price;
    }

}

class Category{
    private String name;
    private ArrayList<Product> items = new ArrayList<>();

    public Category(String name){
        this.name = name;
    }

    public void add(Product p){
        items.add(p);
    }

    public ArrayList<Product> getItems(){
        return items;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return this.name;
    }
}

class Showroom{
    private HashMap<String, ArrayList<Product>> categories;

    public Showroom(){
        categories = new HashMap<>();
    }

    public void add(Category c){
        categories.put(c.getName(), c.getItems());
    }

    public HashMap<String, ArrayList<Product>> getCatalog(){
        return categories;
    }

    public Product search(String name, String productName){
        if(categories.containsKey(name)){
            Set<Map.Entry<String, ArrayList<Product>>> set1 = categories.entrySet();
        for(Map.Entry<String, ArrayList<Product>> s : set1){
            if(s.getKey().equals(name)){
                ArrayList<Product> list = s.getValue();
                for(Product product : list){
                    if(product.getName().equalsIgnoreCase(productName)){
                        return product;
                    }
                }
            }
        }
        }

        return null;
    }

    public void showAllProduct(){
        int cat = 0;
        Set<Map.Entry<String, ArrayList<Product>>> set = categories.entrySet();
        for(Map.Entry<String, ArrayList<Product>> s : set){
            int ite = 0;
            cat++;
            System.out.println(cat + ". " + s.getKey() + "->");
            ArrayList<Product> products = s.getValue();
            for(Product product : products){
                ite++;
                System.out.print(ite + ". " + product + "  ");
            }
            System.out.println();
        }
    }

    // public Product search(String categoryName, String productName){
    //     if(categories.containsKey(categoryName)){
    //         ArrayList<Product> products = categories.get(categoryName);
    //         for(Product product : products){
    //             if()
    //         }
    //     }
    // }
}

class Account{
    Scanner sc = new Scanner(System.in);
    private Showroom showroom;
    private String name;
    private double balance;
    private int pin = 0;
    private ArrayList<Product> itemsBought;

    public Account(){}

    public Account(String name, double balance, int pin){
        this.name = name;
        this.balance = balance;
        this.pin = pin;
        itemsBought = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public double getBalance(){
        return this.balance;
    }

    public int getPin(){
        return this.pin;
    }

    public void selectShowroom(Showroom showroom){
        this.showroom = showroom;
    }

    public void buyProduct(String categoryName, String productName){

        Product product = showroom.search(categoryName, productName);

        if(product == null){
            System.out.println("Sorry product is unavailable.");
            return;
        }

        System.out.println("Enter pin to complete the transaction: ");
        int pin = sc.nextInt();
        sc.nextLine();

        if(validatePin(pin)){
            try{
                if(completeTransaction(product)){
                    itemsBought.add(product);
                    System.out.println("Hurray, You successfully bought the product!");
                    System.out.println("Product name: " + product.getName() + "\tPrice: " + product.getPrice());
                } else {
                    System.out.println("Transaction failed...");
                }
            } catch(Exception e){
                System.out.println(e);
            }
        } else {
            System.out.println("Incorrect pin.");
        }
    }

    public boolean validatePin(int pin){
        if(this.pin == pin){
            return true;
        } else {
            return false;
        }
    }

    public boolean completeTransaction(Product p) throws InsufficientBalance{
        int price = p.getPrice();

        try{
            if(this.balance < price) throw new InsufficientBalance("Not enogh balance.");
            else {
                this.balance = balance - price;
                System.out.println("Purchase complete, Updated balance: $" + this.balance);
                return true;
            }
        } catch(Exception e){
            return false;
        }
    }

    public void showItemsBought(){
        for(Product p : itemsBought){
            System.out.println("Product: " + p.getName());
        }
    }
}

class Test{
    public static void main(String args[]){
        Category categories[] = {
            new Category("Furniture"),
            new Category("Cosmetics"),
            new Category("Electronics"),
        };

        Product furniture[] = {
            new Product("Table", 1120),
            new Product("Chair", 669),
            new Product("Sofa", 5999),
        };

        Product cosmetics[] = {
            new Product("Lipstick", 890),
            new Product("Eyeliner", 600),
            new Product("MackUp kit", 5000),
        };

        Product electronics[] = {
            new Product("Headphones", 1400),
            new Product("Typec cable", 545),
            new Product("Power bank", 4099),
        };

        for(int i = 0; i < categories.length; i++){
            if(categories[i].getName().equalsIgnoreCase("furniture")){
                for(int j = 0; j < furniture.length; j++){
                categories[i].add(furniture[j]);
                }
            } else if(categories[i].getName().equalsIgnoreCase("cosmetics")){
                for(int j = 0; j < cosmetics.length; j++){
                categories[i].add(cosmetics[j]);
                }
            }  else if(categories[i].getName().equalsIgnoreCase("electronics")){
                for(int j = 0; j < electronics.length; j++){
                categories[i].add(electronics[j]);
                }
            }
        }

        // for(Category c : categories){
        //     System.out.println(c);
        //     System.out.println(c.getItems());
        // }

        Showroom show1 = new Showroom();
        for(int i = 0; i < categories.length; i++){
            show1.add(categories[i]);
        }
        Product p1 = show1.search("Furniture", "Mirror");
        if(p1 == null){
            System.out.println("Product or category can not be found.");
        } else {
            System.out.println(p1);
        }

        show1.showAllProduct();

        // Set<Map.Entry<String, ArrayList<Product>>> set1 = show1.getCatalog().entrySet();

        // for(Map.Entry<String, ArrayList<Product>> s : set1){
        //     System.out.println("Category: " + s.getKey() + "\nItems: " + s.getValue());
        // }
    }
}

class Test1{
    public static void main(String args[]){
        Category categories[] = {
            new Category("furniture"),
            new Category("cosmetics"),
            new Category("electronics"),
        };

        Product furniture[] = {
            new Product("table", 1120),
            new Product("chair", 669),
            new Product("sofa", 5999),
        };

        Product cosmetics[] = {
            new Product("lipstick", 890),
            new Product("eyeliner", 600),
            new Product("mackUp kit", 5000),
        };

        Product electronics[] = {
            new Product("headphones", 1400),
            new Product("typec cable", 545),
            new Product("power bank", 4099),
        };

        for(int i = 0; i < categories.length; i++){
            if(categories[i].getName().equalsIgnoreCase("furniture")){
                for(int j = 0; j < furniture.length; j++){
                categories[i].add(furniture[j]);
                }
            } else if(categories[i].getName().equalsIgnoreCase("cosmetics")){
                for(int j = 0; j < cosmetics.length; j++){
                categories[i].add(cosmetics[j]);
                }
            }  else if(categories[i].getName().equalsIgnoreCase("electronics")){
                for(int j = 0; j < electronics.length; j++){
                categories[i].add(electronics[j]);
                }
            }
        }

        // for(Category c : categories){
        //     System.out.println(c);
        //     System.out.println(c.getItems());
        // }

        Showroom show1 = new Showroom();
        for(int i = 0; i < categories.length; i++){
            show1.add(categories[i]);
        }

        Account ac1 = new Account("Abhay", 12000, 1234);
        ac1.selectShowroom(show1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Product Category: ");
        String categoryName = sc.nextLine();

        System.out.println("Please enter Product Name: ");
        String productName = sc.nextLine();

        ac1.buyProduct(categoryName, productName);
    }
}