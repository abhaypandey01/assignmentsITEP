import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle:");
        int radius = sc.nextInt();
        float pi = (float)(Math.PI);

        float area = pi * radius * radius;
        System.out.printf("Area of circle is %.2f", area);
    }
}