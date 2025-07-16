import java.util.Scanner;

class Main {
    public static void main(String args[]){
        int length, breadth, area, parameter;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length (cm): ");
        length = sc.nextInt();
        System.out.print("Enter perimeter (cm): ");
        parameter = sc.nextInt();
        breadth = parameter/2 - length;
        area = length * breadth;
        System.out.println("Breadth ="+breadth+"cm");
        System.out.println("Area ="+area+"cm2");

    }
}
