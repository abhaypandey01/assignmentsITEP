import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet:");
        String inputStr = sc.next();
        char ch = inputStr.charAt(0);

        if((ch >= 65) && (ch <= 90)){
            System.out.println("Entered alphabet is uppercase.");
        } else {
            if((ch >= 97) && (ch <= 122)){
                System.out.println("Entered alphabet is lowercase.");
            } else {
                System.out.println("Entered char is not a alphabet.");
            }
        }
    }
}