import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.println("Enter number of terms(n):");
        int n = sc.nextInt();
        while(i <= n){
            System.out.print(i + " ");
            i++;
        }
    }
}