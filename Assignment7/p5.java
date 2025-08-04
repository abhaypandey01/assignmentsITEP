/*
Product Inventory
Create a class Product with fields: productId, name, quantity, price.
Use setters to assign values. Add a method to calculate total value (quantity * price).
*/

class Product{
    private String name;
    private int productId;
    private int quantity;
    private int price;

    public void setName(String name){
        this.name = name;
    }

    public void setProductId(int productId){
        this.productId = productId;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public int totalPrice(){
        return quantity * price;
    }

}

class Test{
    public static void main(String args[]){
        Product obj = new Product();
        obj.setName("Rice Bag");
        obj.setProductId(101);
        obj.setQuantity(2000);
        obj.setPrice(200);

        int total = obj.totalPrice();

        System.out.println("Total price : " + total);
    }
}