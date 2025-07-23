import java.util.Scanner;

class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1, n2, i = 1, gcd = 1, lcm = 0;
        System.out.println("Enter first number:");
        n1 = sc.nextInt();
        System.out.println("Enter second number:");
        n2 = sc.nextInt();
        
        // int f1 = 1, f2 = 1;
        while((i <= n1) || (i <= n2)){
            if(n1%i==0 && n2%i==0) gcd = i;
            i++;
        }

        lcm = (n1*n2)/gcd;
        System.out.println("Lcm is "+lcm);
    }
}