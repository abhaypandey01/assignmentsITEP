class Book{
    private String title;
    private String author;
    private int price;

    public void setName(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void display(){
        System.out.println("Title\t\tAuthor\t\tPrice");
        System.out.println(title+ "\t" + author + "\t" + price);
    }

}

class Test{
    public static void main(String args[]){
        Book obj = new Book();
        obj.setPrice(1299);
        obj.setName("Big brother");
        obj.setAuthor("Arnim Zola");
        obj.display();
    }
}