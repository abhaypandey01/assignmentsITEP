class Task{
    synchronized public void m1(){
        for(int i = 1; i <= 5; i++){
            System.out.println(Thread.currentThread().getName() + " instance m1");
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }

    synchronized public void m2(){
        for(int i = 1; i <= 5; i++){
            System.out.println(Thread.currentThread().getName() + " instance m2");
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }

    synchronized public static void m3(){
        for(int i = 1; i <= 5; i++){
            System.out.println(Thread.currentThread().getName() + " static m3");
            // Thread.sleep(1000);
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }

    synchronized public static void m4(){
        for(int i = 1; i <= 5; i++){
            System.out.println(Thread.currentThread().getName() + " static m4");
            // Thread.sleep(1000);
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}

class Thread1 extends Thread{
    private Task t;

    public Thread1(Task t){
        this.t = t;
    }

    public void run(){
        t.m1();
    }
}

class Thread2 extends Thread{
    private Task t;

    public Thread2(Task t){
        this.t = t;
    }

    public void run(){
        t.m2();
    }
}

class Thread3 extends Thread{
    private Task t;

    public Thread3(Task t){
        this.t = t;
    }

    public void run(){
        t.m3();
    }
}

class Thread4 extends Thread{
    private Task t;

    public Thread4(Task t){
        this.t = t;
    }

    public void run(){
        t.m4();
    }
}

class Test{
    public static void main(String args[]){
        Task t1 = new  Task();
        Thread1 r1 = new Thread1(t1);
        Thread2 r2 = new Thread2(t1);
        Thread3 r3 = new Thread3(t1);
        Thread4 r4 = new Thread4(t1);

        r1.start();
        r2.start();
        r3.start();
        r4.start();
    }
}