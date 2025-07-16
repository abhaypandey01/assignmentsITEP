import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers you want to swap:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Before swap  Number 1. :"+num1+"\nNumber 2. :"+num2);
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;
        System.out.println("After swap  Number 1. :"+num1+"\nNumber 2. :"+num2);
    }
}