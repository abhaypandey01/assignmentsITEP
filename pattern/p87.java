import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : (odd) ");
        int n = sc.nextInt();
        int mid = n/2;

        for(int i = 0; i<= mid; i++){
            for(int j = 0; j <= mid - i; j++)
            System.out.print(" ");

            for(int k = 0; k < 2*i+1; k++){
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = mid - 1; i >= 0; i--) {
            // Print leading spaces
            for (int j = 0; j <= mid - i; j++) {
                System.out.print(" ");
            }

            // Print pattern
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}