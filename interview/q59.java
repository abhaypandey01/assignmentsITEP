class Parent{
    public void khatna(){
        System.out.println("lulli kat gayi he");

    }
    public void azan(){
        System.out.println("mazid me ja sakta he");
    }

}
class Child extends Parent{
    public void azan()
    {
        System.out.println("mazid me nahi ja sakti");
    }
}
class Test{
    public static void main(String args[])
    {
        Parent a=new Parent();
        Parent b=new Child();
        a.azan();
        b.azan();
        Child s=new Child();
        s.khatna();
    }
}