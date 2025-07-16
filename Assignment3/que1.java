import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int length = sc.nextInt();
        System.out.println("Enter breadth:");
        int breadth = sc.nextInt();
        
        if(length == breadth){
            System.out.println("Square");
        } else {
            System.out.println("Rectangle");
        }
    }
}