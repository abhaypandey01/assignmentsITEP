import java.util.Scanner;
class Test {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i = 1, n = 25;
        
        while(i <= n){
            if(i % 2 != 0) System.out.print((char)(i+64) + " ");
            else System.out.print((char)(i+96) + " ");
            i++;
        }
        
    }
}