class Main {
    public static void main(String args[]){
        int boxes, edge = 3, length = 15, breadth = 9, height = 12, cubeVolume, cartonVolume;
        cubeVolume = (int)(Math.pow(edge, 3));
        cartonVolume = length*breadth*height;
        boxes = cartonVolume/cubeVolume;
        System.out.println("The no. of boxes are "+boxes);
    }
}