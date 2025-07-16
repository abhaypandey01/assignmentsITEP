import java.util.Scanner;
class Main {
    public static void main(String args[]){
        float volumeBrick, volumeWall;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        float length = sc.nextFloat();
        System.out.println("Enter breadth:");
        float breadth = sc.nextFloat();
        System.out.println("Enter height:");
        float height = sc.nextFloat();

        System.out.println("Enter brick length:");
        float brickLength = sc.nextFloat();
        System.out.println("Enter brick breadth:");
        float brickBreadth = sc.nextFloat();
        System.out.println("Enter brick height:");
        float brickHeight = sc.nextFloat();

        volumeBrick = brickLength*brickBreadth*brickHeight;
        volumeWall = length*breadth*height;
        int bricks = (int)(volumeWall/volumeBrick);
        int costOfBricks = 900*(bricks/1000);
        System.out.println("The cost of bricks is "+costOfBricks);
    }
}