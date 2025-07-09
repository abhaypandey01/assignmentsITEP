class Main{
    public static void main(String args[]){
        int tileLength, tileBreadth, floorLength, floorBreadth, floorArea, tileArea, tiles;
        tileLength = 5; tileBreadth = 8;
        floorLength = 200; floorBreadth = 400;
        tileArea = tileLength * tileBreadth;
        floorArea = floorLength * floorBreadth;
        tiles = floorArea/tileArea;
        System.out.println("the total tiles required are "+tiles);
    }
}