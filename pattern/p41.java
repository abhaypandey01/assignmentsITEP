import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int start = 1;

        for(int i = 1; i <= n; i++){
                for (int j = 1; j <= 2 * i - 1; j++){
                System.out.print((char)(start + 64));
                start += 1;
                }
            System.out.println();
        }
    }
}