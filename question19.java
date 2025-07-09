class Main {
    public static void main(String args[]){
        int cudeEdge = 7, length = 7, breadth = 4, height = 8;
        int cubeVolume = (int)(Math.pow(cudeEdge, 3));
        int cuboidVolume = length * breadth * height;
        if(cubeVolume > cuboidVolume){
            System.out.println("Cube has more volume.");
        } else {
            System.out.println("Cuboid has more volume.");

        }
    }
}