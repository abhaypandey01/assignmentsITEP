import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print((i*2+1) + " ");
        }
        System.out.println();

    }
}