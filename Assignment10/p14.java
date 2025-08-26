class MathOperation{
    private int x;
    private int y;
    private double r;

    public MathOperation(int x, int y){
        this.x = x;
        this.y = y;
    }

    public MathOperation(){}

    public void init(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void add(){
        this.r = x + y;
    }

    public void multiply(){
        this.r = x  * y;
    }

    public void power(){
        this.r = Math.pow(x,y);
    }

    public void display(){
        System.out.println("The operation done on " + x + " and " + y + " answer is " + r);
    }

}

class Test{
    public static void main(String args[]){
        MathOperation mo = new MathOperation();
        mo.init(3,4);
        mo.add();
        mo.display();
        mo.multiply();
        mo.display();
        mo.power();
        mo.display();
    }
}