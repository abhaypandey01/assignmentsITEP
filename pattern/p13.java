import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int start = 1;

        for(int i = 1; i <= n; i++){
                if(i % 2 == 0) start = 0;
                else start = 1;
            for(int j = 1; j <= i; j++){
                System.out.print(start);
                if(start == 1)
                start = start - 1;
                else start = start + 1;
            }
            System.out.println();
        }
        System.out.println();
    }
}