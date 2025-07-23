import java.util.Scanner;

class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        
        
        int lastTerm, firstTerm, num, count = 0;
        num = n;

        while(n != 0){
            count++;
            n/=10;
        }

        // System.out.println(count);

        n = num;

        while(n > 10){
            n/=10;
        }

        firstTerm = n;
        lastTerm = num % 10;
        // System.out.println(firstTerm + " and " + lastTerm);

        num %= (int)(Math.pow(10, (count-1)));
        // System.out.println(num);
        num /= 10;

        num = num * 10 + firstTerm;
        num = (int)(Math.pow(10, (count-1))) * lastTerm + num;

        System.out.println("After swapping first digit and unit digit number is " + num);

    }
}