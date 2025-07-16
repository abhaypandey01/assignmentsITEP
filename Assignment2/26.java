import java.util.Scanner;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter path length: ");
        float pathLengthFloat = sc.nextFloat();
        System.out.print("Enter path breadth: ");
        float pathBreadthFloat = sc.nextFloat();
        int pathLength = (int)(pathLengthFloat * 100);
        int pathBreadth = (int)(pathBreadthFloat * 100);
        System.out.print("Enter brick length: ");
        int brickLength = sc.nextInt();
        System.out.print("Enter brick breadth: ");
        int brickBreadth = sc.nextInt();
        int pathArea, bricksArea;
        pathArea = pathLength*pathBreadth;
        bricksArea = brickLength*brickBreadth;
        int bricksNeeded = pathArea/bricksArea;
        System.out.println("The no. of bricks needed is "+bricksNeeded);
    }
}