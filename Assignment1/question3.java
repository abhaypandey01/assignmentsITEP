class Main {
    public static void main(String args[]){
        int tilesLength=13, tilesBreadth=7, tilesArea;
        int regionLength=520, regionBreadth=140, regionArea;
        tilesArea = tilesLength*tilesBreadth;
        regionArea = regionLength*regionBreadth;
        int tilesRequired = regionArea/tilesArea;
        System.out.println("No. of tiles required ="+tilesRequired);

    }
}