class A {
    public void wish(){
        System.out.println("GM");
    }
}

class B extends A {
    public void wish(){
        System.out.println("GN..");
    }
}

class Test{
    public static void main(String args[]){
        A obj = new B();
        obj.wish();
        B obj1 = new B();
        obj1.wish();
    }
}