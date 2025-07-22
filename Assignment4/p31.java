import java.util.Scanner;
//
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int i = 0, a = 0;
        
        while(i <= n){
            a = (int)(Math.pow(10,i)+a);
            System.out.print(a*9 + " ");
            i++;
        }
        
    }
}