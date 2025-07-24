import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year 1:");
        int a = sc.nextInt();
        System.out.println("Enter year 2:");
        int b = sc.nextInt();

        while(a <= b){
            if(a % 100 == 0 && a % 400 == 0 && a % 4 == 0){
                System.out.print(" " + a);
            } else if(a % 4 == 0){
                System.out.print(" " + a);
            }
            a++;
        }

        System.out.println();

    }
}