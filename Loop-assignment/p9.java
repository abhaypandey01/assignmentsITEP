import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter number of terms upto(n):");
        int n = sc.nextInt();
        float sum = 0.0f;
        int i = 1;
        while(i <= n){
            sum = sum + (1.0f/i);
            i++;
        }
        System.out.printf("Sum : %.2f", sum);
    }
}