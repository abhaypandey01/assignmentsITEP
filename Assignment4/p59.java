import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int a = sc.nextInt();
        System.out.println("Enter number 2:");
        int b = sc.nextInt();
        int n = a;
        int sum = 0, i = 9;

        while(a <= b){
            if(a % i == 0) sum +=a;
            a++;
        }

        System.out.println("Sum of all factors of 9 from " + n + " to " + b + " is " + sum);

    }
}