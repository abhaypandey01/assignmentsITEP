import java.util.Scanner;
class Main {
    public static void main(String args[]){
        int side1, side2, side3, perimeter, s, herons;
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1: ");
        side1 = sc.nextInt();
        System.out.print("Enter side2: ");
        side2 = sc.nextInt();
        System.out.print("Enter perimeter: ");
        perimeter = sc.nextInt();
        side3 = perimeter - (side1 + side2);
        s = (side1+side2+side3)/2;
        herons = s * (s-side1) * (s-side2) * (s-side3);
        area = Math.sqrt(herons);
        System.out.println("Area = "+area);
    }
}