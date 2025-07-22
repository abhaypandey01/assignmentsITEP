import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int a = sc.nextInt();
        System.out.println("Enter number 2:");
        int b = sc.nextInt();

        while(a <= b){
            int i =1, count = 0;
            while(i <= a){
                if(a%i == 0) count++;
                i++;
            }
            if(count <= 2) System.out.println(a + " is prime number.");
            a++;
        }

    }
}