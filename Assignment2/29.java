import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of tile: ");
        int side = sc.nextInt();
        System.out.print("Enter length of floor: ");
        int length = sc.nextInt();
        System.out.print("Enter breadth of floor: ");
        int breadth = sc.nextInt();
        int areaTiles, areaFloor, tiles;
        areaTiles = side * side;
        areaFloor = length * breadth;
        tiles = areaFloor/areaTiles;
        System.out.println("No. of tile required "+tiles);
    }
}