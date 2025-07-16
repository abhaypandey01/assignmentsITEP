import java.util.Scanner;
class Main{
    public static void main(String args[]){
        int tileLength, tileBreadth, floorLength, floorBreadth, floorArea, tileArea, tiles;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter tile length: ");
        tileLength = sc.nextInt();
        System.out.print("Enter tile breadth: ");
        tileBreadth = sc.nextInt();
        System.out.print("Enter floor length: ");
        floorLength = sc.nextInt();
        System.out.print("Enter floor breadth: ");
        floorBreadth = sc.nextInt();
        tileArea = tileLength * tileBreadth;
        floorArea = floorLength * floorBreadth;
        tiles = floorArea/tileArea;
        System.out.println("the total tiles required are "+tiles);
    }
}