import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int i = 1, sum = 0;
        
        while(i <= n/2){
            if(n % i == 0) sum += i;
            i++;
        }

        if(sum == n) System.out.println(n + " is perfect no.");
        else System.out.println(n + " is not a perfect no.");
        
    }
}