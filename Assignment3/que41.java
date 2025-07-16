import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Physics, Chemistry, Biology, Mathematics and Computer out of 100:");
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int biology = sc.nextInt();
        int mathematics = sc.nextInt();
        int computer = sc.nextInt();
        int obtained = physics + chemistry + biology + mathematics + computer;
        // System.out.printf("%d\n", obtained);
        double percent = (obtained/500.0)*100.0;
        if(percent >= 90){
            System.out.println("Grade A");
        }
        else if(percent >= 80){
            System.out.println("Grade B");
        }
        else if(percent >= 70){
            System.out.println("Grade C");
        }
        else if(percent >= 60){
            System.out.println("Grade D");
        }
        else if(percent >= 40){
            System.out.println("Grade E");
        }
        else {
            System.out.println("Grade F");
        }
    }
}