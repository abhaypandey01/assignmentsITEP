class ProductQuanityNull extends Exception{
    public ProductQuanityNull(){
        super(
            "Product quantity zero, quantity must be non zero."
        );
    }
}

class Product{
    private int totalprice;
    private int quantity;

    public Product(){}

    public Product(int totalprice, int quantity){
        this.totalprice = totalprice;
        this.quantity = quantity;
    }

    public int getPrice(){
        return totalprice;
    }

    public int getQuantity(){
        return quantity;
    }

    public int getPerPiecePrice() throws ProductQuanityNull{
        try{
            if(quantity == 0) throw new ProductQuanityNull();
            return totalprice/quantity;
        }
        catch(ProductQuanityNull e){
            System.out.println(e);
            System.out.println("Showing price for one quantity by default.");
            return totalprice;
        } 
    }
}

class Test{
    public static void main(String args[]){
        Product p1 = new Product(1200, 2);
        

        Product p2 = new Product(1099, 0);
        
        try{
            
            System.out.println(p1.getPerPiecePrice());
            System.out.println(p2.getPerPiecePrice());
        } catch(ProductQuanityNull e){
            System.out.println(e);
        }
    }
}