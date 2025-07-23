import java.util.Scanner;

class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1, n2, i = 1, hcf = 1;
        System.out.println("Enter first number:");
        n1 = sc.nextInt();
        System.out.println("Enter second number:");
        n2 = sc.nextInt();
        
        while((i <= n1) || (i <= n2)){
            if(n1%i==0 && n2%i==0) hcf = i;
            i++;
        }
        System.out.println("HCF is "+hcf);
    }
}