import java.util.Scanner;
class Main{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first term (a): ");
        int a = sc.nextInt();
        System.out.print("Enter the common difference (d): ");
        int d = sc.nextInt();
        System.out.print("Enter the number of terms (n): ");
        float n = sc.nextFloat();
        float sn;
        sn = (float)(n/2*(2*a + (n-1)* d));
        System.out.printf("The sum upto 28th term will be %.0f",sn);
    }
}