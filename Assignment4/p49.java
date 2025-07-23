import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1:");
        int a = sc.nextInt();

        System.out.println("Enter the number 2:");
        int b = sc.nextInt();


        while(a <= b){
            int i = 1, sum = 0;
            while(i <= a/2){
                if(a%i == 0) sum += i;
                i++;
            }
            if(sum == a) System.out.println(a + " is a perfect number.");
            a++;
        }
    }
}