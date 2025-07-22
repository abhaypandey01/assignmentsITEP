import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int i = 1;

        while(i <= 10){
            System.out.println(n + "x" + i + "=" + n*i);
            i++;
        }
        
    }
}