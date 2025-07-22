import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int i = 2;
        System.out.println(1);

        while(i <= n/2){
            if(n % i == 0) System.out.println(i); 
            i++;
        }
        System.out.println(n);
    }
}