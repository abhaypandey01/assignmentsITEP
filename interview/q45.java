class Parent{
    public void run(){
        System.out.println("Parent running");
    }
}

class Child extends Parent{
    // public void run(){
    //     // System.out.println("Child running");
    // }
}

class Test{
    public static void main(String arg[]){
        Parent c = new Child();
        c.run();
    }
}