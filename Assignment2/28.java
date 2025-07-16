import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();
        System.out.print("Enter cost per meter (cpm): ");
        int cpm = sc.nextInt();
        int area;
        area = length * breadth;
        int totalCost = area * cpm;
        System.out.println("the total cost is "+totalCost+" $");
    }
}