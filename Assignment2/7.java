import java.util.Scanner;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int base, height, area;
        System.out.print("Enter base: ");
        base = sc.nextInt();
        System.out.print("Enter area: ");
        area = sc.nextInt();
        height = (2*area)/base;
        System.out.println("Height = "+height);
    }
}