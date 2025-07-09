class Main{
    public static void main(String args[]){
        // int length = 30, breadth = 20, path1 = 3, path2 = 4, usableLength, usableBreadth, usableArea;
        // usableBreadth = breadth - path1;
        // usableLength = length - path2;
        // usableArea = usableLength * usableBreadth;
        // System.out.println("the total cost is "+usableArea+" m^2");

        int pw1 = 3, pw2 = 4, length = 30, breadth = 20, areapath1, areapath2, areaTotal, areaRequired, extraArea;
        areapath1 = 3*30;
        areapath2 = 4*20;
        extraArea = 3*4;
        areaTotal = 30*20;
        areaRequired = areaTotal - (areapath1+areapath2-extraArea);
        System.out.println("the total cost is "+areaRequired+" m^2");

    }
}