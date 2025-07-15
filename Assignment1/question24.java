class Main {
    public static void main(String args[]){
        int brickBreadth=25, brickLength=10, length=20*100, breadth=2*100, volumeBrick, volumeWall;
        float brickHeight = 7.5f;
        int height = (int)(0.75*100);
        volumeBrick = (int)(brickLength*brickBreadth*brickHeight);
        volumeWall = (int)(length*breadth*height);
        int bricks = volumeWall/volumeBrick;
        int costOfBricks = 900*(bricks/1000);
        System.out.println("The cost of bricks is "+costOfBricks+"$");
    }
}