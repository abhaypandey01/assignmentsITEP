import java.util.Scanner;
// arithematic using switch case
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter alphabet to check vowel:");
        String inputStr = sc.next().toLowerCase();
        float result;

        switch(inputStr){
            case "a":
                System.out.println("Entered char is vowel.");
                break;

            case "e":
                System.out.println("Entered char is vowel.");

                break;

            case "i":
                System.out.println("Entered char is vowel.");

                break;

            case "o":
                System.out.println("Entered char is vowel.");

                break;

            case "u":
                System.out.println("Entered char is vowel.");


            default:
                System.out.println("Entered char is not a vowel.");
        }

        
    }
}