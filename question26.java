class Main {
    public static void main(String args[]){
        int pathArea, brickBreadth=15, brickLength=24, bricksArea, pathLength = 120*100, pathBreadth = (int)(2.4*100);
        pathArea = pathLength*pathBreadth;
        bricksArea = brickLength*brickBreadth;
        int bricksNeeded = pathArea/bricksArea;
        System.out.println("The no. of bricks needed is "+bricksNeeded);
    }
}