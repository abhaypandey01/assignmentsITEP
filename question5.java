class Main {
    public static void main(String args[]){
        int totalCost, costPerMeter, length, breadth, area, perimeter;
        totalCost = 1600;
        length = 20; 
        costPerMeter = 25;
        perimeter = totalCost/costPerMeter;
        breadth = (perimeter/2)-length;
        area = length*breadth;
        System.out.println("Area = "+area+"\nPerimeter = "+perimeter+"\nBreadth = "+breadth);
    }
}