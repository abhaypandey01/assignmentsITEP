import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the perimeter of the square: ");
        int perimeter = sc.nextInt();
        int side, area;
        side = perimeter/4;
        area = side * side;
        System.out.println("the total area of square is "+area+" m^2");
    }
}