import java.util.Scanner;
class Main{
    public static void main(String args[]){
        int poolSide, gardenSide, gardenArea, poolArea, area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the garden: ");
        gardenSide = sc.nextInt();
        System.out.print("Enter the side of the pool: ");
        poolSide = sc.nextInt();
        gardenArea = gardenSide * gardenSide;
        poolArea = poolSide * poolSide;
        area = gardenArea - poolArea;
        System.out.println("the total area of garden is "+area);
    }
}