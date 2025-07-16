import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter grades:");
        int grade = sc.nextInt();

        if(grade > 80){
            System.out.println("A");
        } else if(grade > 60){
            System.out.println("B");
        } else if(grade > 50){
            System.out.println("C");
        } else if(grade > 45){
            System.out.println("D");
        } else if(grade > 25){
            System.out.println("E");
        } else {
            System.out.println("F");
        }
    }
}