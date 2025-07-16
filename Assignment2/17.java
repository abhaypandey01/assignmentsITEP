import java.util.Scanner;
class Main {
    public static void main(String args[]){
        int length , breadth , perimeter;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        length = sc.nextInt();
        System.out.print("Enter breadth: ");
        breadth = sc.nextInt();
        perimeter = 2*(length+breadth);
        System.out.println("Length of ribbon = "+perimeter+"m");
    }
}