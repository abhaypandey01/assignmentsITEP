import java.util.Scanner;
class Main {
    public static void main(String args[]){
        int pathArea, brickBreadth, brickLength, bricksArea, bricks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter brick length:");
        brickLength = sc.nextInt();
        System.out.println("Enter brick breadth:");
        brickBreadth = sc.nextInt();
        System.out.println("Enter number of bricks:");
        bricks = sc.nextInt();
        pathArea = bricks*(brickBreadth*brickLength);
        System.out.println("The area of path is "+pathArea);
    }
}