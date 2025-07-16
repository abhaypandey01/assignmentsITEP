import java.util.Scanner;
class Main {
    public static void main(String args[]){
        /*
        h^2 = a^2 + b^2
        13^2 = 12^2 + b^2
        b^2 = 13^2 - 12^2
        b = Math.sqrt(13^2 - 12^2)
        */
        int hypotenuse , side1 , side2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hypotenuse: ");
        hypotenuse = sc.nextInt();
        System.out.print("Enter side1: ");
        side1 = sc.nextInt();
        side2 = (int)(Math.sqrt(Math.pow(hypotenuse,2)-Math.pow(side1,2)));
        System.out.println("Third side = "+side2);
    }
}