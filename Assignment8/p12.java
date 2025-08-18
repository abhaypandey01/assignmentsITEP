/**
 * Write a Java program to create a class called "Airplane" with a flight number, destination, and departure time attributes, and methods to check flight status and delay.
 */

class Airplane{
    private int flightNum;
    private String destination;
    private String departure;
    private boolean delay;

    public Airplane(){}

    public Airplane(int flightNum, String destination, String departure){
        this.flightNum = flightNum;
        this.destination = destination;
        this.departure = departure;
    }

    public void delayed(){
        this.delay = true;
    }

    public void isDelayed(){
        if(delay){
            System.out.println("Your flight is delayed.");
        }
        else {
            System.out.println("Your flight is on time.");
        }
    }

    public void displayFlightDetails(){
        System.out.println("Flight no. " + flightNum + " for destination - "+ destination);
    }
}

class Test{
    public static void main(String args[]){
        Airplane ap1 = new Airplane(1234, "Gaza", "3:65");
        ap1.isDelayed();
        ap1.delayed();
        ap1.isDelayed();

    }
}