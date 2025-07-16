import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of person 1:");
        int age1 = sc.nextInt();
        System.out.println("Enter age of person 2:");
        int age2 = sc.nextInt();
        System.out.println("Enter age of person 3:");
        int age3 = sc.nextInt();

        if((age1 > age2) && (age1 > age3)){
            System.out.println("Person 1 is oldest.");
        } else if((age2 > age1) && (age2 > age3)){
            System.out.println("Person 2 is oldest.");
        } else {
            System.out.println("Person 3 is oldest.");
        }

        if((age1 < age2) && (age1 < age3)){
            System.out.println("Person 1 is youngest.");
        } else if((age2 < age1) && (age2 < age3)){
            System.out.println("Person 2 is youngest.");
        } else {
            System.out.println("Person 3 is youngest.");
        }
    }
}