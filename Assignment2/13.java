import java.util.Scanner;
class Main {
    public static void main(String args[]){
        /*
        let one leg as base and the other leg as height 
         */
        int legOne, area, legTwo;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter leg one: ");
        legOne = sc.nextInt();
        System.out.print("Enter area: ");
        area = sc.nextInt();
        legTwo = (int)((area*2)/legOne);
        System.out.println("other leg = "+legTwo);
    }
}