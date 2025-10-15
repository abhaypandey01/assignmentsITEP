import java.util.*;
class Test1{
    String s;
    public Test1(String s)
    {
        this.s=s;
    }
    public void digitsum()
    {
        
        char ch[]=s.toCharArray();
        int sum=0;
        for(int i=0;i<ch.length;i++)
        {
            Character ch1 = ch[i];
            if(Character.isDigit(ch1)){
                int temp=Integer.parseInt(ch1.toString());
                sum+=temp;

            }
        }
        System.out.println("  :"+sum);
    }
    public void validUserName()
    {
        
        char ch[]=s.toCharArray();
        
        for(int i=0;i<ch.length;i++)
        {
            Character ch1 = ch[i];
            if(Character.isLetter(ch1)){
               

            }
            else
            {
                System.out.println("this name is not valid");
                break;

            }
        }
    }
    public void d()
    {
        
        char ch[]=s.toCharArray();
        
        int count=0;
        for(char c:ch)
        {
            count++;
        }
        
        for(int i=0;i<ch.length;i++)
        {
            if(count<10  || count >10)
        {
            System.out.println("no is not valid");
            break;2
            
        }
            Character ch1 = ch[i];
            if(Character.isDigit(ch1)){
                

            }
            else{
                System.out.println("no is not valid");
                break;
            }
        }
    }
}
class Test{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Test1 t=new Test1(s);
        t.d();


    }
}