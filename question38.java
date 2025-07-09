class Main{
    public static void main(String args[]){
        double volume = 1287, radius = 10, height, sa;
        height = volume/(3.14 * radius * radius);
        sa = 2*3.14*radius*(radius+height);
        System.out.printf("Surface area of cylinder = %.2f units", sa);
    }
}