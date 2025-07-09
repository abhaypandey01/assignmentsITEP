class Main{
    public static void main(String args[]){
        double sa = 149;
        double height = 6;
        double pi = Math.PI;
        double a = 2*pi;
        double b = 2*pi*height;
        double c = -sa;
        double descriminant = Math.sqrt(b*b-4*a*c);
        double radius = (-b+descriminant)/(2*a);
        double diameter = 2*radius;
        System.out.printf("Diameter of cylinder = %.2f units", diameter);
    }
}