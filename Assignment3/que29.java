import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 4 different numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        if((num1 < num2) && (num1 < num3) && (num1 < num4)){
            System.out.println("Num 1 is Lowest.");
        }else if((num2 < num1) && (num2 < num3) && (num2 < num4)){
            System.out.println("Num 2 is Lowest.");

        }else if((num3 < num2) && (num3 < num1) && (num3 < num4)){
            System.out.println("Num 3 is Lowest.");

        }else {
            System.out.println("Num 4 is Lowest.");

        }
        
    }
}