import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int i = 1, count = 0;

        while(i <= n){
            if(n % i == 0) count++;
            i++;
        }
        if(count == 2) System.out.println(n + " is a prime.");
        else System.out.println(n + " is not a prime."); 
    }
}