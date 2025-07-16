import java.util.Scanner;
class Main {
    public static void main(String args[]){
        int length , breadth , area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextInt();
        System.out.print("Enter breadth: ");
        breadth = sc.nextInt();
        area = length * breadth;
        System.out.println("Total carpet required = "+area);
    }
}