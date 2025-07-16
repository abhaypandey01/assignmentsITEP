import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first term (a): ");
        float a = sc.nextFloat();
        System.out.print("Enter the common difference (d): ");
        float d = sc.nextFloat();
        System.out.print("Enter the term number (n): ");
        float n = sc.nextFloat();
        float an;
        an = (float)(a + (n-1)*d);
        System.out.printf("The 28th term will be %.0f",an);
    }
}