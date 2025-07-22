import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int a = sc.nextInt();
        System.out.println("Enter number 1:");
        int b = sc.nextInt();

        while(a <= b){
            int sum = 0, n = a;
            while(n != 0){
                int digit = n % 10, fact =1, i = 1;
                while(i <= digit){
                    fact *= i;
                    i++;
                }
                sum += fact;
                n/=10;
            }

            if(a == sum) System.out.println(a + " is a strong number.");
            a++;
        }

    }
}