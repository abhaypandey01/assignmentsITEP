import java.util.Scanner;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side: ");
        int side = sc.nextInt();
        double area;
        area = Math.sqrt(3)/4*(side * side);
        System.out.printf("Area = %.5f",area);
    }
}