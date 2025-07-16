import java.util.Scanner;
class Main {
    public static void main(String args[]){
        int boxes, edge, length, breadth, height, cubeVolume, cartonVolume;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        length = sc.nextInt();
        System.out.println("Enter breadth:");
        breadth = sc.nextInt();
        System.out.println("Enter height:");
        height = sc.nextInt();
        System.out.println("Enter edge:");
        edge = sc.nextInt();
        cubeVolume = (int)(Math.pow(edge, 3));
        cartonVolume = length*breadth*height;
        boxes = cartonVolume/cubeVolume;
        System.out.println("The no. of boxes are "+boxes);
    }
}