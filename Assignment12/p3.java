import java.util.*;

class Test{
    public static void main(String args[]){
        int ar[] = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter the index of element: ");
            int i = sc.nextInt();
            int n = ar[i];
            System.out.println(n);
        }
        catch(InputMismatchException | ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
}