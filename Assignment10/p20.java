/**
Create class Tile to store the edge length of a square tile , and create another class Floor to store length and width of a rectangular floor. Add method totalTiles(Tile t) in Floor class with Tile as argument to calculate the whole number of tiles needed to cover the floor completely.
 */

class Floor{
    private int length;
    private int width;

    public Floor(){}

    public Floor(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getFloorArea(){
        return length * width;
    }

    public int totalTiles(Tile t){
        return getFloorArea()/t.getTileArea();
    }
}

class Tile{
    private int edge;

    public Tile(){}

    public Tile(int edge){
        this.edge = edge;
    }

    public int getTileArea(){
        return edge * edge;
    }

}

class Test{
    public static void main(String args[]){
        Floor floor = new Floor(100,200);
        Tile tile = new Tile(20);

        int total = floor.totalTiles(tile);
        System.out.println("The required number of tiles are " + total);
    }
}