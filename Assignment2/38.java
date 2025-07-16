import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter volume of cylinder: ");
        double volume = sc.nextDouble();
        System.out.print("Enter radius of cylinder: ");
        double radius = sc.nextDouble();
        double height, sa;
        height = volume/(3.14 * radius * radius);
        sa = 2*3.14*radius*(radius+height);
        System.out.printf("Surface area of cylinder = %.2f units", sa);
    }
}