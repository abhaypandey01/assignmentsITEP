class Parent{
    public Parent(){
        System.out.println("Parent constructor");

    }

    public void Display(){
        System.out.println("PArent display");
    }
}

class Child extends Parent{
    public Child(){
        // super();
        System.out.println("Child contructor");
    }

    public void Display(){
        super.Display();
    }
}

class Test{
    public static void main(String arg[]){
        Child c = new Child();
        c.Display();
    }
}