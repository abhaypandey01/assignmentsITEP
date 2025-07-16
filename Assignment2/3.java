import java.util.Scanner;
class Main {
    public static void main(String args[]){
        int tilesLength, tilesBreadth, tilesArea;
        int regionLength, regionBreadth, regionArea;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter tile length: ");
        tilesLength = sc.nextInt();
        System.out.print("Enter tile breadth: ");
        tilesBreadth = sc.nextInt();
        System.out.print("Enter region length: ");
        regionLength = sc.nextInt();
        System.out.print("Enter region breadth: ");
        regionBreadth = sc.nextInt();
        tilesArea = tilesLength*tilesBreadth;
        regionArea = regionLength*regionBreadth;
        int tilesRequired = regionArea/tilesArea;
        System.out.println("No. of tiles required ="+tilesRequired);

    }
}