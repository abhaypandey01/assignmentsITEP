import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        char ch = 97;

        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(n - j);
            }
            System.out.println();
        }
    }
}