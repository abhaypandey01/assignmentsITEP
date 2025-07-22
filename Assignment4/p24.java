import java.util.Scanner;
//
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int i = 1;
        int even = 0;
        
        while(i <= n){
            even+=2;
            System.out.println(even*even);
            i++;
        }
        
    }
}