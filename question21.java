class Main {
    public static void main(String args[]){
        int length=15, breadth=10, height=8, brickLength=15, brickBreadth=8, brickHeight=5, volumeWall, volumeBrick, bricks;
        volumeWall = length*breadth*height;
        volumeBrick = brickLength*brickBreadth*brickHeight;
        bricks = volumeWall/volumeBrick;
        System.out.println("The no. of a bricks required = "+bricks);
    }
}