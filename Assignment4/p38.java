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
            count++;
            n/=10;
        }

        n= num;

        while(n != 0){
            int digit = n%10;
            sum += (int)(Math.pow(digit,count));
            n/=10;
        }

        if(sum == num) System.out.println(num + " is armstrong.");
        else System.out.println(num + " is not armstrong.");

    }
}