import java.util.Scanner;
class Main {
    public static void main(String args[]){
        /*
        clearly shelly rectangular garden = 22 * 15
        shelly has square garden = 21 * 21
        rachel has bigger garden
         */
        int length, breadth, side, rachelGardenArea, shellyGardenArea;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Rachel's garden length: ");
        length = sc.nextInt();
        System.out.print("Enter Rachel's garden breadth: ");
        breadth = sc.nextInt();
        System.out.print("Enter Shelly's garden side: ");
        side = sc.nextInt();
        rachelGardenArea = length*breadth;
        shellyGardenArea = side*side;
        if(rachelGardenArea > shellyGardenArea){
            System.out.println("Shelly has bigger garden by "+(rachelGardenArea - shellyGardenArea)+"m");
        } else {
            System.out.println("Rachel has bigger garden by "+(shellyGardenArea - rachelGardenArea)+"m");
        }
    }
}