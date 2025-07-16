import java.util.Scanner;
class Main {
    public static void main(String args[]){
        int length, breadth, height, brickLength, brickBreadth, brickHeight, volumeWall, volumeBrick, bricks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        length = sc.nextInt() * 100;
        System.out.println("Enter breadth:");
        breadth = sc.nextInt() * 100;
        System.out.println("Enter height:");
        height = sc.nextInt() * 100;
        System.out.println("Enter brick length:");
        brickLength = sc.nextInt();
        System.out.println("Enter brick breadth:");
        brickBreadth = sc.nextInt();
        System.out.println("Enter brick height:");
        brickHeight = sc.nextInt();
        volumeWall = length*breadth*height;
        volumeBrick = brickLength*brickBreadth*brickHeight;
        bricks = volumeWall/volumeBrick;
        System.out.println("The no. of a bricks required = "+bricks);
    }
}