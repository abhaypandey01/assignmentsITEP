class Task{
    public static synchronized void m1(){
        System.out.println("m1");
    }
}

class Mythread1 extends Thread{
    private Task t;

    public Mythread1(Task t){
        this.t = t;
    }

    public void run(){
        for(int i = 1; i < 20; i++){
            System.out.print(Thread.currentThread().getName()+ " : ");
            t.m1();
        }
    }
}

class Test{
    public static void main(String args[]){
        Task t1 = new Task();
        Task t2 = new Task();

        Mythread1 th1 = new Mythread1(t1);
        Mythread1 th2 = new Mythread1(t2);
        th1.start();
        th2.start();

    }
}