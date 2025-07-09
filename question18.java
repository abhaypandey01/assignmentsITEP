class Main {
    public static void main(String args[]){
        int length = 50, breadth = 30, perimeter;
        float totalDistance;
        perimeter = 2*(length+breadth);
        totalDistance = perimeter*10;
        float distanceInKm = totalDistance/1000;
        System.out.println("Ron jogs total = "+distanceInKm+"km");
    }
}