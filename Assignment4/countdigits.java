import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, count = 0;
        System.out.println("Enter a number:");
        n = sc.nextInt();

        while(n != 0){
            n/= 10;
            count++;
        }
        System.out.println(count);
    }
}