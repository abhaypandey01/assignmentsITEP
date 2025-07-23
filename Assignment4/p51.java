import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1:");
        int a = sc.nextInt();

        System.out.println("Enter the number 2:");
        int b = sc.nextInt();


        while(a <= b){
            int i = a, rev = 0;
            while(i != 0){
                int digit = i % 10;
                rev = rev * 10 + digit;
                i /= 10;
            }
            System.out.println("Reverse of " + a + " is " + rev);
            a++;
        }
    }
}