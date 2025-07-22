import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int a = sc.nextInt();
        System.out.println("Enter number 2:");
        int b = sc.nextInt();

        while(a <= b){
            int fact =1, j = 1;
            while(j <= a){
                fact *= j;
                j++;
            }
            
            System.out.println("Factorial of " + a + " is " + fact);

            a++;
        }

    }
}