import java.util.Scanner;
//1 2 4 7 11 ....
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int a = 1, b= 2, c = 1;

        System.out.print(a + " " + b + " ");

        for(int i = 1; i <= n; i++){
            c = a * b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
            System.out.println();
    }
}