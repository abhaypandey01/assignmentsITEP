import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int rev = 0;
        int num = n;
        
        while(n != 0){
            int digit = n %10;
            rev  = rev * 10 + digit;
            if(digit == 0 && rev == 0) System.out.print("0");
            n/=10;
        }

        if(rev == num) System.out.println(num + " is a palindrome number.");
        else System.out.println(num + " is not a palindrome number.");
    }
}