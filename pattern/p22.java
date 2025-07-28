import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(j == i || j == 1 || i == n)
                System.out.print((char)(j + 64));
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}