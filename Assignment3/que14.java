import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the percent obtained:");
        float percent = sc.nextFloat();

        if(percent >= 90){
            System.out.println("A grade.");
        } else if((percent >= 80)){
            System.out.println("B grade.");
        } else if((percent >= 60)){
            System.out.println("C grade.");
        } else {
            System.out.println("D grade.");
        }
    }
}