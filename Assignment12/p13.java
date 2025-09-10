import java.util.*;
class Test{
    public int input()
    {
        try{
            Scanner sc=new Scanner(System.in);
            int b=sc.nextInt();
            return b;
        }
        catch(InputMismatchException e)
        {
            return input();
        }
    }
    public static void main(String args[])
    {
        Test t=new Test();
        int i=t.input();
        System.out.println(i);
    }
}