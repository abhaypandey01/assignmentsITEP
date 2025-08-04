import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int start = 0;

        for(int i = 1; i <= n; i++){
                for(int j = 0; j <= start; j++){
                System.out.print("*");
                }
                start += i;
            System.out.println();
        }
    }
}