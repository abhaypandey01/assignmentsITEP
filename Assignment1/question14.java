class Main {
    public static void main(String args[]){
        /*
        perpendicular distances are height 1 and height 2 and the diagonal is given then using the formula for area of diagonal
        a = 1/2(d*(h1+h2))
         */
        int h1, h2, diagonal, area;
        h1 = 13;
        h2 = 10;
        diagonal = 46;
        area = (int)((diagonal*(h1+h2))/2);
        System.out.println("Area  = "+area);
    }
}