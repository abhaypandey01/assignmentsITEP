import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n, count = 0, firstTerm = 0, lastTerm = 0, num;
        System.out.println("Enter a number:");
        n = sc.nextInt();
        num = n;
        //counting digits
        while(n != 0){
            n/= 10;
            count++;
        }

        n = num;
        //getting first digit
        while(n > 10 ){
            n/= 10;
        }

        firstTerm = n;

        //getting last term
        lastTerm = num%10;

        //removing first digit
        num%=(int)(Math.pow(10,(count - 1)));

        //removing last digit
        num/=10;

        //adding first term
        num = (num*10) + firstTerm;

        //adding last term
        num = (int)(lastTerm * (Math.pow(10,(count-1)))+num);
        
        System.out.println("Number after swapping last and first digit: "+num);
    }
}