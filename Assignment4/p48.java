import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1:");
        int a = sc.nextInt();

        System.out.println("Enter the number 2:");
        int b = sc.nextInt();


        while(a <= b){
            int i = 1;
            System.out.println("Factors of "+a);
            while(i <= a){
                if(a%i == 0) System.out.println(i);
                i++;
            }
            System.out.println("---------------");
            a++;
        }
    }
}