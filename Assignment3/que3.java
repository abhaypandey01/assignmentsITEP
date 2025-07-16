import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary: ");
        int salary = sc.nextInt();
        System.out.println("Enter years of service: ");
        int years = sc.nextInt();
        float bonus = 0.05f;
        float net_bonus;

        if(years > 5){
            net_bonus = salary * bonus;
            System.out.println("Net bonus will be: "+ net_bonus);
        } else {
            System.out.println("Years of service are less than 5, no bonus.");
        }

    }
}