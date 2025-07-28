import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n - i; j++){
                    System.out.print(" ");
                }
                for(int j = 1; j <= i; j++){
                    if(j == 1 || j == i || i == n)
                    System.out.print((char)(64 + j));
                    else
                    System.out.print("_");
                }
            System.out.println();
        }
    }
}