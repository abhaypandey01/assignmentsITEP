class Task1{
    synchronized public void m1(Task2 obj)
    {
        System.out.println("m1 called");
        obj.m2();
    }
    synchronized public void m2()
    {
        System.out.println("m2- called");
    }
}
class Task2
{
    synchronized public void m1(Task1 obj)
    {
        System.out.println("m1 called");
        obj.m2();
    }
    synchronized public void m2()
    {
        System.out.println("m2- called");
    }


}
class First extends Thread
{
    Task1 obj;
    Task2 obj2;
    public First(Task1 obj,Task2 obj2)
    {
        this.obj=obj;
        this.obj2=obj2;

    }
    public void run()
    {
        obj.m1(obj2);
        
    }
}
class Second extends Thread
{
    Task1 obj;
    Task2 obj2;
    public Second(Task1 obj,Task2 obj2)
    {
        this.obj=obj;
        this.obj2=obj2;

    }
    public void run()
    {
        obj2.m1(obj);
        
    }
}
class Test{
    public static void main(String args[])
    {
        Task1 t1=new Task1();
        Task2 t2=new Task2();
        First f=new First(t1,t2);
        Second s=new Second(t1,t2);
        f.start();
        s.start();
    }
}