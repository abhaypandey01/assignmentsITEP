import java.util.Scanner;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter area: ");
        int area = sc.nextInt();
        System.out.print("Enter ratio1: ");
        int ratio1 = sc.nextInt();
        System.out.print("Enter ratio2: ");
        int ratio2 = sc.nextInt();
        float x, height, base;
        x = (float)(Math.sqrt((area*2)/(ratio1*ratio2)));
        height = 8 * x;
        base = 5 * x;
        System.out.println("Height = "+height);
        System.out.println("Base = "+base);

    }
}