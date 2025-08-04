import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        char ch = 'A';

        for (int i = 1; i <= n; i++) {
            // Print leading spaces for formatting
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2*i-1; k++) {
                if(k== 1|| k == 2*i-1 || i == n)
                System.out.print(ch);
                else
                System.out.print(" ");
            }
            ch++;
            System.out.println();
        }
    }
}
