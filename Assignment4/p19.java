import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        float sum = 0.0f;

        for(int i = 1; i <= n; i++){
            sum += 1.0f/i;
        }
            System.out.printf("Sum : %.2f\n", sum);
    }
}