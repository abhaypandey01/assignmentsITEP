import java.io.*;
import java.util.*;

class InsufficientBalance extends RuntimeException{
    public InsufficientBalance(){
        super("not enough balance`");
    }
}

class MisMatch extends Exception{
    public MisMatch(){
        super("Different");
    }
}

class Child{
    public void comp(String d) throws MisMatch{
        if(d.equals("katahua")) throw new MisMatch();
        else System.out.println("Mat kar lala");
    }

    public void kata(String y){
        if(y.equals("katahua")) throw new InsufficientBalance();
    }
}

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Child c = new Child();
        System.out.println("Enter comp: ");
        String s = sc.nextLine();
        try{
            c.kata(s);
        } catch(Exception e){
            System.out.println(e);
        }
        c.comp(s);
    }
}