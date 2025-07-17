import java.util.Scanner;
// arithematic using switch case
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter alphabet to check vowel:");
        char inputStr = sc.next().charAt(0);
        float result;

        switch(inputStr){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': System.out.println("Entered char is a vowel."); break;
            default:
                System.out.println("Entered char is not a vowel.");
        }

        
    }
}