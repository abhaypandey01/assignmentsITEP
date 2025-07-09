class Main{
    public static void main(String args[]){
        int side = 10, length = 800, breadth = 900, areaTiles, areaFloor, tiles;
        areaTiles = side * side;
        areaFloor = length * breadth;
        tiles = areaFloor/areaTiles;
        System.out.println("No. of tile required "+tiles);
    }
}