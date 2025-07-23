import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int num = n;
        int odd = 0, even = 0;
        while(n != 0){
            int digit = n%10;
            if(digit % 2 == 0) even++;
            else odd++;
            n/=10;
        }

        System.out.println(num + " includes " + even + " even numbers and " + odd + " odd numbers.");

    }
}