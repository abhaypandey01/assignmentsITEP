import java.util.*;

class UnderAgeException extends Exception{
    public UnderAgeException(){
        super("Sorry, you can't vote coz you are under 18.");
    }
}

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
            int age = sc.nextInt();
            if(age < 18) throw new UnderAgeException();
            System.out.println("You can vote.");
        } catch(InputMismatchException | UnderAgeException e){
            System.out.println(e);
        } finally{
            sc.close();
        }
    }
}