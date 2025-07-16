import java.util.Scanner;
// arithematic using switch case
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        System.out.println("Enter operator to use(-,+,*,/,%):");
        String inputStr = sc.next();
        float result;

        switch(inputStr){
            case "-":
                result = num1 - num2;
                System.out.println("Result is "+ result);
                break;

            case "+":
                result = num1 + num2;
                System.out.println("Result is "+ result);
                break;

            case "*":
                result = num1 * num2;
                System.out.println("Result is "+ result);
                break;

            case "/":
                result = num1 / num2;
                System.out.println("Result is "+ result);
                break;

            case "%":
                result = num1 % num2;
                System.out.println("Result is "+ result);
                break;

            default:
                System.out.println("Invalid selection.");
        }

        
    }
}