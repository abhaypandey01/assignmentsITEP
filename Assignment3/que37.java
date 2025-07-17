import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check if it is a multiple of 5 or not:");
        int num = sc.nextInt();
        if(num==0)
        {
            System.out.println("this no is not divisible by 5");
        }
        else if (num % 5 ==0){
            System.out.println("Number is divisble by 5.");
        }
        else {
            System.out.println("Number is not divisible by 5.");
        }
        
        if(num==0)
        {
            System.out.println("this no is not divisible by 11.");
        }
        else if (num % 11 ==0){
            System.out.println("Number is divisble by 11.");
        }
        else {
            System.out.println("Number is not divisible by 11.");
        }

    }
}