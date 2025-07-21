import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms(n):");
        int n  =sc.nextInt();
        int i = 1;
        int next = 1;
        int a = 1, b =2;
        System.out.print(a+" "+b);
        while(i <= (n-2)){
            next = a * b;
            a = b;
            b = next;
            System.out.print(" "+next);
            i++;
        }
        
        // int sum = j + (1/2);int j = 1;
    }
}