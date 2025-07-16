import java.util.Scanner;
class Main {
    public static void main(String args[]){
        int length , breadth , perimeter;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextInt();
        System.out.print("Enter breadth: ");
        breadth = sc.nextInt();
        float totalDistance;
        perimeter = 2*(length+breadth);
        totalDistance = perimeter*10;
        float distanceInKm = totalDistance/1000;
        System.out.println("Ron jogs total = "+distanceInKm+"km");
    }
}