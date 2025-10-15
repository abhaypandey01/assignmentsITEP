import java.util.*;
class Product implements Comparable<Product>{
    private int id;
    private String name;

    public Product(int id, String name){
        this.name = name;
        this.id = id;
    }

    public String toString(){
        return this.name+" "+this.id;
    }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }

    public int compareTo(Product p){
        return this.id - p.id;
    }
}

class IdComparator implements Comparator<Product>{
    public int compare(Product p1, Product p2){
        return p1.getId() - p2.getId();
    }
}

class NameComparator implements Comparator<Product>{
    public int compare(Product p1, Product p2){
        return p1.getName().compareTo(p2.getName());
    }
}

class Test{
    public static void main(String args[]){
        Product ps[] = {
            new Product(5, "chair"),
            new Product(4, "bed"),
            new Product(3, "curtain"),
            new Product(2, "laptop"),
            new Product(1, "mouse"),
        };

        ArrayList<Product> list = new ArrayList<Product>();

        for(Product p : ps){
            list.add(p);
        }

        Collections.sort(list, new NameComparator());

        for(Product p : list){
            System.out.println(p);
        }
    }
}

