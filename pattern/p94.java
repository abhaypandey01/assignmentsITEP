import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : (odd)");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){

            for(int j = 1; j <= n; j++){
                if(j == (n/2)+1)
                {
                    if(i > (n/2)+1)
                    System.out.print(n-i+1);
                    else
                    System.out.print(i);
                }
                else if(i == (n/2)+1)
                {
                    if(j > (n/2)+1)
                    System.out.print(n-j+1);
                    else
                    System.out.print(j);
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}