class Apk{
    public static void running()
    {
        System.out.println("runing without parameter");
    }
    public static void running(int i)
    {
        System.out.println("running with parameter");
    }
    public void run()
    {
        System.out.println("RUN WITHOUT PARMETER");
    } 
    public void run(int i)
    {
        System.out.println("running with parameter");
    }
}
class Test{
    public static void main(String args[])
    {
        Apk.running();
        Apk.running(2);
        Apk a=new Apk();
        a.run();
        a.run(2);
    }

}