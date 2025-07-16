import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check if it is a multiple of 5 or not:");
        int num = sc.nextInt();
        if(num % 10 == 5){
            System.out.println("Number entered is divisble by 5.");
        }
        else {
            System.out.println("Number is not divisible by 5.");
        }
        

    }
}