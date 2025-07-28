import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter decimal number:");
        int n = sc.nextInt();
        String str = "", decimal = "";

        while(n != 0){
            int digit = n%2;
            str += digit;
            n/=2;
        }

        for(int i = str.length()-1; i >= 0; i--){
            decimal += str.charAt(i);
        }

        System.out.println("Binary form : " + decimal);

    }
}