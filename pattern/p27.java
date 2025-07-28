import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        char ch = 97;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                if(j == 1 || j ==i || i == n){
                if(j % 2 == 0)
                System.out.print(0);
                else System.out.print(1);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}