import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int count = 0;
        int num = n;
        int sum = 0;

        while(n != 0){
            int digit = n%10;
            int fact = 1, i = 1;
            while(i <= digit){
                fact *= i;
                i++;
            }
            sum =+ fact;
            n/=10;
        }

        if(sum == num) System.out.println(num + " is strong.");
        else System.out.println(num + " is not strong.");

    }
}