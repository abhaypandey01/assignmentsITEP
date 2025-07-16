import java.util.Scanner;
class Main {
    public static void main(String args[]){
        int length, width, costPerMeter, totalCost, area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextInt();
        System.out.print("Enter width: ");
        width = sc.nextInt();
        System.out.print("Enter cost per meter: ");
        costPerMeter = sc.nextInt();
        area = length*width;
        totalCost=area*costPerMeter;
        System.out.println("TOtal cost will be: "+totalCost+"$");
    }
}