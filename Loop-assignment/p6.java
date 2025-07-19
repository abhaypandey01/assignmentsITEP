import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of iterations(n):");
        int n = sc.nextInt();
        int i = 1;
        int even = 0;
        while(i <= n){
            System.out.print(even + " ");
            even +=2;
            i++;
        }
    }
}