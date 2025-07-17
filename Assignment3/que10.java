import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = sc.nextInt();

        if(year % 100 == 0){

            if(year % 400 == 0) System.out.println("Given year is a leap year and leap century.");
            else System.out.println("Given year is not a leap year.");

        }else if(year % 4 == 0){
            System.out.println("leap year.");
        } else {
            System.out.println("leap year.");
        }
    }
}