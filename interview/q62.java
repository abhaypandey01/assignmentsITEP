abstract class Parent{
    abstract public void run();

    public void display(){
        run();
    }
}

class Child extends Parent{
    public void run(){
        System.out.println("Abstract running in child");
    }
}

class Test{
    public static void main(String arg[]){
        Child c = new Child();
        // c.run();
        c.display();
    }
}