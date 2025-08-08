/* 
Rectangle Area Calculator
Create a class Rectangle with fields: length, width.
Use setters to assign values. Add a method to calculate area.
*/

class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(){}

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public void setLength(int length){
        this.length = length;
    }

    public void setBreadth(int breadth){
        this.breadth = breadth;
    }

    public double getArea(){
        return length*breadth;
    }

    
}

class Test{
    public static void main(String args[]){
        Rectangle obj = new Rectangle(4, 5);
        // obj.setLength(3);
        // obj.setBreadth(4);
        double area = obj.getArea();

        System.out.printf("Area is %.1f", area);
    }
}