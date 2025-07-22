import java.util.Scanner;
//1 2 4 7 11 ....
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int i = 1;
        int a = 1;
        System.out.println(a);

        while(i <= n){
            a = a+i;
            System.out.println(a);
            i++;
        }
        
    }
}