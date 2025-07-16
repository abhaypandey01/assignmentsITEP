import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter choices(+,>,==):");
        String input = sc.nextLine();
        switch(input){
            case "+":
                System.out.println("Result of sum: "+ (a+b));
                break;
            case ">":
                System.out.println("Result of greater than check: "+ (a>b));
                break;
            case "==":
                System.out.println("Result of equality check: "+ (a==b));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}