import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int a = sc.nextInt();
        System.out.println("Enter number 2:");
        int b = sc.nextInt();

        while(a <= b){
            if(a % 2 != 0) System.out.println(a + " is a odd Number.");
            a++;
        }

    }
}