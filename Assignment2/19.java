import java.util.Scanner;
class Main {
    public static void main(String args[]){
        int cudeEdge , length , breadth , height ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cube edge: ");
        cudeEdge = sc.nextInt();
        System.out.print("Enter cuboid length: ");
        length = sc.nextInt();
        System.out.print("Enter cuboid breadth: ");
        breadth = sc.nextInt();
        System.out.print("Enter cuboid height: ");
        height = sc.nextInt();
        int cubeVolume = (int)(Math.pow(cudeEdge, 3));
        int cuboidVolume = length * breadth * height;
        if(cubeVolume > cuboidVolume){
            System.out.println("Cube has more volume.");
        } else {
            System.out.println("Cuboid has more volume.");

        }
    }
}