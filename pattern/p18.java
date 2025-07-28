import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                if(j % 2 == 0) System.out.print(1);
                else System.out.print(0);
            }
            System.out.println();
        }
        System.out.println();
    }
}