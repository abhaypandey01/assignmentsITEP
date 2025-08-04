import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // Print leading spaces for formatting
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            int value = 1;
            for (int k = 0; k <= i; k++) {
                System.out.print(value + " ");
                value = value * (i - k) / (k + 1);
            }

            System.out.println();
        }
    }
}
