class Main {
    public static void main(String args[]){
        int length=1500, breadth=1000, height=800, brickLength=15, brickBreadth=8, brickHeight=5, volumeWall, volumeBrick, bricks;
        volumeWall = length*breadth*height;
        volumeBrick = brickLength*brickBreadth*brickHeight;
        bricks = volumeWall/volumeBrick;
        System.out.println("The no. of a bricks required = "+bricks);
    }
}