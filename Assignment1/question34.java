class Main{
    public static void main(String args[]){
        int base1 = 128, base2 = 92, height = 40, area, requiredArea, pathWidth = 4, pathArea;
        area = (int)(0.5f*(base1+base2)*height);
        pathArea = pathWidth*height;
        requiredArea = area + pathArea; 
        System.out.println("the total area of wooden is "+requiredArea+" m^2");
    }
}