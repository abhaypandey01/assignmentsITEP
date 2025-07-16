import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length & breadth:");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int area = length * breadth;

        System.out.println("Total area of rectaangle is "+ area);
    }
}