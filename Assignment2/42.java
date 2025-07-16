import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the radius of the cylinder: ");
        float r = sc.nextFloat();
        System.out.print("Please enter the height of the cylinder: ");
        float height = sc.nextFloat();
        float volume;
        volume = (float)(3.14*r*r*height);
        System.out.printf("the volume of cylinder is %.2f",volume," cubic units");
    }
}