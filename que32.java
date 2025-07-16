import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("Positive.");
        } else if(num < 0){
            System.out.println("Negative.");
        }else{
            System.out.println("Neutral.");
        }
    }
}