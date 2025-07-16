import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num = sc.nextInt();
        // int absvalue = (num < 0) ? -num : num;
        int absvalue;
        if(num < 0) absvalue = -num;
        else absvalue = num;
        System.out.println("Absolute value = "+ absvalue);

        }
    }