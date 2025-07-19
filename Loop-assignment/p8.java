import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms(n):");
        int n  =sc.nextInt();
        int i = 1;
        int term = 1;
        int a = 1, b =2;
        System.out.print(a+" "+b);
        while(i <= (n-2)){
            term = a * b;
            a = b;
            b = term;
            System.out.print(" "+term);
            i++;
        }
        int j = 1;
        int sum = j + (1/2);
    }
}