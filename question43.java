class Test{
    public static void main(String args[]){
        float height = 4.0f, slanth = 5.0f, rpm = 10.0f, r, baseArea, cost;
        r = (float)(Math.sqrt(Math.pow(slanth, 2) - Math.pow(height, 2)));
        baseArea = (float)(Math.PI * Math.pow(r, 2));
        cost = (float)(baseArea * rpm);
        System.out.printf("Cost of polishig is %.2f",cost);
    }
}