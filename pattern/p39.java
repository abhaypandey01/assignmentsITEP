import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();

        for(int i = n; i >= 1; i--){
            if( i % 2 == 0){
                for (int j = 1; j <= i; j++)
                System.out.print(j);
            } else {
                for (int j = i; j >= 1; j--)
                System.out.print(j);
            }
            System.out.println();
        }
    }
}