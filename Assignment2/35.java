import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float r = sc.nextFloat();
        System.out.print("Enter height: ");
        float h = sc.nextFloat();
        float sa = 2 * (22 / 7.0f) * r * (r + h);
        System.out.println("The surface area is " + sa + " cm^2");
    }
}