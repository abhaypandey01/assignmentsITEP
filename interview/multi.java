import java.util.*;

class Task{
    synchronized public void consume()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("consuming");
            try{
                Thread.sleep(1300);
            }catch(Exception e){}
        }
    }
    synchronized public void order()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("ordering");
            try{
                Thread.sleep(1300);
            }catch(Exception e){}
        }
    }
    synchronized public void produce()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("production");
            try{
                Thread.sleep(1300);
            }catch(Exception e){}
        }
    }
}
class Consumer extends Thread{
    Task t;
    public Consumer(Task t){
        this.t = t;
    }
    public void run(){
        t.order();
        synchronized(t){
            try{
                t.wait();
            }catch(Exception e){}
        }
        t.consume();
    }
}

class Producer extends Thread{
    Task t;
    public Producer(Task t){
        this.t = t;
    }
    public void run(){
        t.produce();
        synchronized(t){
            try{
                t.notify();
            }catch(Exception e){}
        }
    }
}

class Test{
    public static void main(String args[]){
        Task t1 = new Task();
        Consumer c1 = new Consumer(t1);
        Producer p1 = new Producer(t1);
        c1.start();
        p1.start();
        try{
            p1.join();
        }catch(Exception e){}
    }
}

