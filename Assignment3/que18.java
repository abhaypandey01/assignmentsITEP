import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total marks:");
        float total = sc.nextFloat();
        System.out.println("Enter obtained marks:");
        float obtained = sc.nextFloat();

        float percent = (obtained/total)*100.0f;

        System.out.println("The percent obtained: "+ percent);
    }
}