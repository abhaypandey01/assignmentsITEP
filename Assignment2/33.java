import java.util.Scanner;
class Main{
    public static void main(String args[]){
        int pw1, pw2, length , breadth , areapath1, areapath2, areaTotal, areaRequired, extraArea;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextInt();
        System.out.print("Enter breadth: ");
        breadth = sc.nextInt();
        System.out.print("Enter pw1: ");
        pw1 = sc.nextInt();
        System.out.print("Enter pw2: ");
        pw2 = sc.nextInt();
        areapath1 = 3*30;
        areapath2 = 4*20;
        extraArea = 3*4;
        areaTotal = 30*20;
        areaRequired = areaTotal - (areapath1+areapath2-extraArea);
        System.out.println("the total cost is "+areaRequired);

    }
}