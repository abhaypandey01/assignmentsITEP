import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, i = 0, a= 0;
        System.out.println("Enter number of  terms:");
        n = sc.nextInt();
    
        while(i < n){
            a = (int)(Math.pow(10,i)+a);
            System.out.print(a+" ");
            i++;
        }
    }
}