import java.util.Scanner;
class Main{
    public static void main(String args[]){
        int base1, base2, height, area, requiredArea, pathWidth, pathArea;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base1: ");
        base1 = sc.nextInt();
        System.out.print("Enter base2: ");
        base2 = sc.nextInt();
        System.out.print("Enter height: ");
        height = sc.nextInt();
        System.out.print("Enter path width: ");
        pathWidth = sc.nextInt();
        area = (int)(0.5f*(base1+base2)*height);
        pathArea = pathWidth*height;
        requiredArea = area + pathArea; 
        System.out.println("the total area of wooden is "+requiredArea+" m^2");
    }
}