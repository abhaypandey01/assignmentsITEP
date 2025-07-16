import java.util.Scanner;
class Main {
    public static void main(String args[]){
        int equalSides;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of equal sides: ");
        equalSides = sc.nextInt();
        float area;
        area = (equalSides*equalSides)/2;
        System.out.println("Area = "+ area);
    }
}