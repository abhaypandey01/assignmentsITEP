class Main {
    public static void main(String args[]){
        /*
        clearly shelly rectangular garden = 22 * 15
        shelly has square garden = 21 * 21
        rachel has bigger garden
         */
        int length=22, breadth=15, side=21, rachelGardenArea, shellyGardenArea;
        rachelGardenArea = length*breadth;
        shellyGardenArea = side*side;
        if(rachelGardenArea > shellyGardenArea){
            System.out.println("Shelly has bigger garden by "+(rachelGardenArea - shellyGardenArea)+"m");
        } else {
            System.out.println("Rachel has bigger garden by "+(shellyGardenArea - rachelGardenArea)+"m");
        }
    }
}