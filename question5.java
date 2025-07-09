class Main {
    public static void main(String args[]){
        int totalCost, costPerMeter, length, breadth, area, perimeter;
        totalCost = 1600;
        length = 20; costPerMeter = 25;
        area = totalCost/costPerMeter;
        breadth = area/length;
        perimeter = 2*(length+breadth);
        System.out.println("Area = "+area+"\nPerimeter = "+perimeter+"\nBreadth = "+breadth);

    }
}