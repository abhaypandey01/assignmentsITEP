/*
Mobile Phone Store
Create a class Mobile with fields: brand, model, price.
Use setters to set values. Create a method to check if phone is affordable (price < 20000).
 */
class Mobile{
    private String brand;
    private String model;
    private int price;

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void display(){
        System.out.println("Brand : " + brand);
        System.out.println("Model : "+ model);
        System.out.println("Year : "+ price);
    }

    public boolean isAffordable(){
        if(price < 20000) return true;
        return false;
    }

}

class Test{
    public static void main(String args[]){
        Mobile obj = new Mobile();
        obj.setBrand("Samsung");
        obj.setModel("Galaxy A30");
        obj.setPrice(21000);
        obj.display();
        boolean affordable = obj.isAffordable();

        System.out.println("Phone is affordable: "+ affordable);
    }
}