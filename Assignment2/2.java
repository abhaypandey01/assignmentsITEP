import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int length, perimeter, area, breadth;
        System.out.print("Enter breadth: ");
        breadth = sc.nextInt();
        System.out.print("Enter area: ");
        area = sc.nextInt();
        length = area/breadth;
        perimeter = 2*(length + breadth);
        System.out.println("Length = "+length);
        System.out.println("Perimeter = "+perimeter);

    }
}