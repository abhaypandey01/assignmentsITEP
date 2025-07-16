import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temprature and then select conversion to F/C:");
        String inputStr = sc.next();
        char ch = inputStr.charAt(0);
        float temp = sc.nextFloat();
        float toFahrenheit, toCelcius;
        switch(ch){
            case 'f':

                break;
            
            case 'c':
                toCelcius = (temp-32)*(5/9.0f);
                System.out.printf("The temrpature in celcius is %.2f", toCelcius);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
