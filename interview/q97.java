import java.util.*;
class Test{
    public static void main(String args[])
    {
        try(Scanner sc=new Scanner(System.in)){
            int i=sc.nextInt();
            if(i==1)
            throw new Error();
        }
        catch(Error e)
        {
            System.out.println("error catch");
        }
        finally{
            System.out.println("finally called");
        }
    }
}