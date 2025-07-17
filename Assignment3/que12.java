import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number containing 4 digits:");
        int num = sc.nextInt();
        int rev, place1, place2, place3, place4;

        if(num > 1000 && num < 9999){
            place1 = num%10;
            place2 = (num/10)%10;
            place3 = (num/100)%10;
            place4 = num/1000;

            rev = place1 * 1000 + place2 * 100 + place3 * 10 + place4;
            System.out.println("Reversed number will be "+ rev);

        }
    }
}