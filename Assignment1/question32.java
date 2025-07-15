class Main{
    public static void main(String args[]){
        int poolSide = 25, gardenSide = 150, gardenArea, poolArea, area;
        gardenArea = gardenSide * gardenSide;
        poolArea = poolSide * poolSide;
        area = gardenArea - poolArea;
        System.out.println("the total area of garden is "+area+" m^2");
    }
}