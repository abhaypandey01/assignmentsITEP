class Child{

    private int i;
    private int j;
    public Child(int i, int j){
        this(j);
        this.i = i;
        
    }

    public Child(int j){
        this.j=j;


    }
    public void display()
    {
        System.out.println(this.j+" "+this.i);
    }

}
class Test{
    public static void main(String args[])
    {
        Child c=new Child(1,2);
        c.display();
    }
}