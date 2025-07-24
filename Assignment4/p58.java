import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal number:");
        int n = sc.nextInt();
        int decimal = 0;
        int rev = 0;
        
        while(n != 0){
            int digit = n%2;
            rev = rev * 10 + digit;
            n/=2;
        }

        while(rev != 0){
            int digit = rev % 10;
            decimal = decimal * 10 + digit;
            rev/=10;
        }

        System.out.println("Decimal form is " + decimal);
    }
}