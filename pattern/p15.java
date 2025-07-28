import java.util.Scanner;
class Test {
    public static void main(String args[]){
        char leter = 'A';

        for(int i = 0; i < 5; i++){
            for(int j = 0; j <= i; j++){
                System.out.print((char)(i+leter));
            }
            System.out.println();
        }
        System.out.println();
    }
}