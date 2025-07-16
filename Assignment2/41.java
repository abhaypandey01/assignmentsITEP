import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        float r = sc.nextFloat();
        System.out.print("Enter height: ");
        float height = sc.nextFloat();
        float volume;
        volume = (float)(3.14*r*r*height);
        System.out.println("the volume of cylinder is "+volume+" cubic units");
    }
}