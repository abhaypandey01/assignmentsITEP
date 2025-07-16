import java.util.Scanner;
class Main {
    public static void main(String args[]){
        int length, breadth, height, volume;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextInt();
        System.out.print("Enter breadth: ");
        breadth = sc.nextInt();
        System.out.print("Enter height: ");
        height = sc.nextInt();
        volume = length*breadth*height;
        System.out.println("The volume of a brick of ice-cream = "+volume+" cm3");
    }
}