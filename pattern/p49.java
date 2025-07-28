import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int start;

        for(int i = 1; i <= n; i++){
                for(int j = 1; j <= n - i; j++){
                    System.out.print(" ");
                }
                start = 1;
                for(int j = 1; j <= i; j++){
                    System.out.print(start);
                    if(start == 0){
                        start += 1;
                    } else {
                        start -=1;
                    }
                }
            System.out.println();
        }
    }
}