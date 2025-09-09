import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter first number:");
        int a = sc.nextInt();
            System.out.println("Enter second number:");
        int b = sc.nextInt();
        try{
            int c = a/b;
        } catch(ArithmeticException e){
            System.out.println(e);
        }

    }
}