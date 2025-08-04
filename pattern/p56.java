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
                int digit = 1;
                for(int j = 1; j <= i; j++){
                    if(digit == 1){
                        System.out.print(digit);
                        digit--;
                    } else {
                        System.out.print(digit);
                        digit++;
                    }
                }
            System.out.println();
        }
    }
}