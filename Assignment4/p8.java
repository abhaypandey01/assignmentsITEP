import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int a = -1, b = 1, c = 0;

        for(int i = 1; i <= n; i++){
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
        System.out.println();

    }
}