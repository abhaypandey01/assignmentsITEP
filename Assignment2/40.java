import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        double volume;
        volume = 3.14*radius*radius*height;
        System.out.printf("Volume of cylinder = %.2f units", volume);
    }
}