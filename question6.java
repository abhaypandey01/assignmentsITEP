class Main {
    public static void main(String args[]){
        int side1, side2, side3, perimeter, s, herons;
        double area;
        side1 = 10;
        side2 = 9;
        perimeter = 36;
        side3 = perimeter - (side1 + side2);
        s = (side1+side2+side3)/2;
        herons = s * (s-side1) * (s-side2) * (s-side3);
        area = Math.sqrt(herons);
        System.out.println("Area = "+area);
    }
}