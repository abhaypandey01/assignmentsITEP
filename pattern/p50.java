import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
                for(int j = n - i; j >= 1; j--){
                    System.out.print(" ");
                }
                for(int j = 1; j <= i; j++){
                    System.out.print(j);
                }
            System.out.println();
        }
    }
}