/*
Rectangle Area Calculator
Create a class Rectangle with fields: length, width.
Use setters to assign values. Add a method to calculate area.
 */

class Circle {
    private int radius;

    public Circle(int radius){
        this.radius = radius;
    }

    public Circle(){}

    public void setRadius(int radius){
        this.radius = radius;
    }

    public double getArea(){
        return 3.14*radius*radius;
    }

    public double getCircumference(){
        return 2*3.14*radius;
    }
}

class Test{
    public static void main(String args[]){
        Circle obj = new Circle(4);
        // obj.setRadius(3);
        double area = obj.getArea();
        double circum = obj.getCircumference();

        System.out.printf("Area is %.2f", area, " \nCircumference is %.2f", circum);
    }
}