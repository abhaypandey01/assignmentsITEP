import java.util.Scanner;
class Main {
    public static void main(String args[]){
        /*
        perpendicular distances are height 1 and height 2 and the diagonal is given then using the formula for area of diagonal
        a = 1/2(d*(h1+h2))
         */
        int h1, h2, diagonal, area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height 1: ");
        h1 = sc.nextInt();
        System.out.print("Enter height 2: ");
        h2 = sc.nextInt();
        System.out.print("Enter diagonal: ");
        diagonal = sc.nextInt();
        area = (int)((diagonal*(h1+h2))/2);
        System.out.println("Area  = "+area);
    }
}