import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        float height = sc.nextFloat();
        System.out.print("Enter slant height: ");
        float slanth = sc.nextFloat();
        System.out.print("Enter rate per meter: ");
        float rpm = sc.nextFloat();
        float r, baseArea, cost;
        r = (float)(Math.sqrt(Math.pow(slanth, 2) - Math.pow(height, 2)));
        baseArea = (float)(Math.PI * Math.pow(r, 2));
        cost = (float)(baseArea * rpm);
        System.out.printf("Cost of polishig is %.2f",cost);
    }
}