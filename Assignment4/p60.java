import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        int a = sc.nextInt();
        System.out.println("Enter number 2:");
        int b = sc.nextInt();
        int num = a;
        float sqrtNum;

        System.out.printf("Squares from %d to %d : \n", a, b);

        while(a <= b){
            System.out.print(" " + (a*a));
            a++;
        }
            System.out.println();

            a = num;
            System.out.printf("Cubes from %d to %d : \n", a, b);

            while(a <= b){
            System.out.print(" " + (a*a*a));
            a++;
        }
            System.out.println();

            a = num;
            System.out.printf("Square roots from %d to %d : \n", a, b);

            while(a <= b){
                sqrtNum = (float)(Math.sqrt(a));
            System.out.printf(" %.3f", sqrtNum);
            a++;
        }
            System.out.println();

    }
}