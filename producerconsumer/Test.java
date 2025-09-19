class PC
{
    synchronized public void consume()
    {
        for(int i=0;i<5;i++)
        {
        System.out.println(Thread.currentThread().getName()+" "+"the consumer is consuming");
        try{

        Thread.sleep(1000);
        }
        catch(Exception e)
        {
            
        }


        }
    }
    synchronized public void order()
    {
        for(int i=0;i<5;i++)
        {
        System.out.println(Thread.currentThread().getName()+" "+"the consumer is ordering");


        }

    }

    synchronized public void produce()
    {
        for(int i=0;i<5;i++)
        {
        System.out.println(Thread.currentThread().getName()+" "+"the consumer is produce");


        }
    }
    
}

class Ctherd extends Thread
{
    private PC obj;
     
    public Ctherd(PC obj)
    {
        this.obj=obj;
    }

    public void run()
    {
        obj.order();
        try{
        wait();

        }
        catch(Exception e)
        {

        }
        obj.consume();

    }
}

class Cctherd extends Thread
{
    private PC obj;
     
    public Cctherd(PC obj)
    {
        this.obj=obj;
    }

    public void run()
    {
        // obj.order();
        try{
        wait();

        }
        catch(Exception e)
        {

        }
        obj.consume();

    }
}

 

class PThread extends Thread
{
    private PC obj;
    public PThread(PC obj)
    {
        this.obj=obj;
    }
    public void run()
    {
        obj.produce();
        try{
            notifyAll();
        }
        catch(Exception e)
        {
            
        }
    }
}

class Test
{
    public static void main(String args[])
    {
        PC p=new PC();
        PThread pt=new PThread(p);
        Cctherd c1=new Cctherd(p);
        Cctherd c2=new Cctherd(p);
        Cctherd c3=new Cctherd(p);
        Cctherd c4=new Cctherd(p);
        Cctherd c5=new Cctherd(p);
        Ctherd ct=new Ctherd(p);
        ct.setName("costumer main");

        ct.start();
        
        pt.start();
        try{
        // ct.join(3000);
        pt.join();
         }
         catch(Exception e)
         {

         }


        c1.start();
        c2.start();

        c3.start();

        c4.start();

        c5.start();


    }
}