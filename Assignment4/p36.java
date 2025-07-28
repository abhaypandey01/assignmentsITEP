import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");

        int n = sc.nextInt();
        String rev = "";
        
        while(n > 0){
            int digit = n %10;
            rev  += digit;
            n/=10;
        }

        System.out.println(rev);
        
    }
}