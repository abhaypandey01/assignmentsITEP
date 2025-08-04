import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
                for(int j = n - i; j >= 1; j--){
                    System.out.print(" ");
                }
                for(int j = 1; j <= 2*i-1; j++){
                    if(j == i)
                    System.out.print("#");
                    else
                    System.out.print("*");
                }
            System.out.println();
        }
    }
}