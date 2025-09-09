import java.util.*;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any input value: ");
        try{
        int a = sc.nextInt();
        } catch(InputMismatchException e){
            System.out.println(e);
        }
    }
}