import java.util.*;

class Product{
    private int id;
    private String name;

    public Product(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return id+" : "+name;
    }
}

class Category{
    private HashSet<Product> items;
    private String name;

    public Category(String name){
        this.name = name;
        items = new HashSet<Product>();
    }

    public void add(Product p){
        items.add(p);
    }

    public void remove(int id){
        items.remove(new Integer(id));
    }

    public void displayCategory(){
        for(Product item : items){
            System.out.println(item);
        }
    }

    public HashSet<Product> list(){
        return items;
    }

    public String getName(){
        return name;
    }
}

class Test{
    public static void main(String args[]){
        Category categories[] = {
            new Category("Cosmetics"),
            new Category("Electronics"),
        };

        Product cosmetics[] = {
            new Product(1, "Lipstick"),
            new Product(2, "Eyeliner"),
        };

        Product electronics[] = {
            new Product(1, "Mobile"),
            new Product(2, "Laptop"),
        };

        for(int i = 0; i < categories.length; i++){
            if(i == 0){
                for(int j = 0; j < cosmetics.length; j++){
                    categories[i].add(cosmetics[j]);
                }
            }
            if(i == 1){
                for(int j = 0; j < cosmetics.length; j++){
                    categories[i].add(electronics[j]);
                }
            }
        }

        HashMap<String, HashSet<Product>> map = new HashMap<>();
        for(Category c : categories){
            map.put(c.getName(), c.list());
        }

        Set<Map.Entry<String, HashSet<Product>>> set = map.entrySet();
        for(Map.Entry<String, HashSet<Product>> s : set){
            System.out.println("Category: "+ s.getKey());
            HashSet<Product> items = s.getValue();
            for(Product p : items){
                System.out.println("Item "+ p);
            }
        }
    }
}