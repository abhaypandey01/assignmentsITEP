import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print(" " + (i*i));
        }
            System.out.printf("\n");
    }
}