import java.util.Scanner;
class Main {
    public static void main(String args[]){
        int totalCost, costPerMeter, length, breadth, area, perimeter;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total cost: ");
        totalCost = sc.nextInt();
        System.out.print("Enter length: ");
        length = sc.nextInt();
        System.out.print("Enter cost per meter: ");
        costPerMeter = sc.nextInt();
        perimeter = totalCost/costPerMeter;
        breadth = (perimeter/2)-length;
        area = length*breadth;
        System.out.println("Area = "+area+"\nPerimeter = "+perimeter+"\nBreadth = "+breadth);
    }
}