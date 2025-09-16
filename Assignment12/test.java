import java.io.*;

class InvalidAge extends Exception{
    public InvalidAge(String str){
        super(str);
    }
}

class Person{
    private int age;

    public Person(int age) throws InvalidAge{
        if(age < 0) throw new InvalidAge("Age is negative");
        else this.age = age;
    }

    public int getAge(){
        return age;
    }
}

class Test{
    public static void getIoException() throws IOException{
        throw new IOException();
    }

    public static void getArithmeticEXception() throws ArithmeticException{
        throw new ArithmeticException();
    }

    public static void main(String args[]){
    //     try{

    //     getIoException();
    //     } catch(IOException e){
    //         e.printStackTrace();
    //     }

    //     getArithmeticEXception();
    // }

    try{
    Person p1 = new Person(-12);
    } catch(InvalidAge e){
        System.out.println(e);
        e.printStackTrace();
    }

    try{
    Person p1 = new Person(12);
    int age = p1.getAge();
    System.out.println(age);
    } catch(InvalidAge e){
        System.out.println(e);
        e.printStackTrace();
    }
}
}