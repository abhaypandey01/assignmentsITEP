import java.util.Scanner;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int altitude, base, area;
        System.out.print("Enter area: ");
        area = sc.nextInt();
        System.out.print("Enter altitude: ");
        altitude = sc.nextInt();
        base = (2*area)/altitude;
        System.out.println("Base = "+base);
    }
}