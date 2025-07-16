import java.util.Scanner;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();
        System.out.print("Enter cost per meter: ");
        int costpm = sc.nextInt();
        int diningArea, totalCost;
        diningArea = length*breadth;
        totalCost = costpm * diningArea;
        System.out.println("The total cost for dining room will be "+totalCost);
    }
}