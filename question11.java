class Main {
    public static void main(String args[]){
        int area = 320, ratio1 = 8, ratio2 = 5;
        float x, height, base;
        x = (float)(Math.sqrt((area*2)/(ratio1*ratio2)));
        height = 8 * x;
        base = 5 * x;
        System.out.println("Height = "+height);
        System.out.println("Base = "+base);

    }
}