import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer:");
        int num = sc.nextInt();
        
        if(num > 0){
            System.out.println("Entered integer is Positive");
        } else if(num < 0){
            System.out.println("Entered integer is Negative");
        } else {
            System.out.println("Entered integer is Neutral");
        }
    }
}