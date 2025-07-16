import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter surface area (sa): ");
        double sa = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        double pi = Math.PI;
        double a = 2*pi;
        double b = 2*pi*height;
        double c = -sa;
        double descriminant = Math.sqrt(b*b-4*a*c);
        double radius = (-b+descriminant)/(2*a);
        double diameter = 2*radius;
        System.out.printf("Diameter of cylinder = %.2f units", diameter);
    }
}