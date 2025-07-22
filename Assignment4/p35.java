import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int i = 0, a = n;
        
        while(a != 0){
            i++;
            n%=10;
            a /=10;
        }

        System.out.println("number has " + i + " digits.");
        
    }
}