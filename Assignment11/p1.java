interface Chargeable{
    void ChargeBattery();
}

abstract class Vehicle{
    private String registrationNo;

    public Vehicle(){}

    public Vehicle(String registrationNo){
        this.registrationNo = registrationNo;
    }

    abstract public void start();

    abstract public void stop();

    public String displayInfo(){
        return registrationNo;
    }
    
}

class Car extends Vehicle{
    private String num;

    public Car(){}

    public Car(String num){
        super(num);
        this.num = num;
    }


    public void start(){
        System.out.println("Car "+ num + " is starting with petrol engine...");
    }

    public void stop(){
        System.out.println("Car "+ num + " is stopped.");
    }
}

class Truck extends Vehicle{
    private String num;

    public Truck(){}

    public Truck(String num){
        super(num);
        this.num = num;

    }

    public void start(){
        System.out.println("Car " + num + " is starting with petrol engine...");
    }

    public void stop(){
        System.out.println("Car " + num + " is stopped.");
    }
}

class ElectricCar extends Vehicle implements Chargeable{
    private String num;

    public ElectricCar(){}

    public ElectricCar(String num){
        super(num);
        this.num = num;

    }

    public void start(){
        System.out.println("Electric car " + num + " is starting silently...");
    }

    public void stop(){
        System.out.println("Electric Car " + num + " is stopped.");
    }

    public void ChargeBattery(){
        System.out.println("Battery is charging...");
    }
}

class ElectricBike extends Vehicle implements Chargeable{
    private String num;

    public ElectricBike(){}

    public ElectricBike(String num){
        super(num);
        this.num = num;

    }

    public void start(){
        System.out.println("Electric Bike " + num + " is starting silently...");
    }

    public void stop(){
        System.out.println("Electric Bike " + num + " is stopped.");
    }

    public void ChargeBattery(){
        System.out.println("Battery is charging...");
    }
}

class Test{
    public static void main(String args[]){
        Vehicle veh1 = new Car("1234ABCD5678");
        veh1.start();
        veh1.stop();

        Vehicle veh2 = new Truck("1000ABCD5000");
        veh2.start();
        veh2.stop();

        Vehicle veh3 = new ElectricCar("1200ABCD5600");
        Chargeable electricVeh3 = new ElectricCar("1200ABCD5600");
        veh3.start();
        electricVeh3.ChargeBattery();
        veh3.stop();

        Vehicle veh4 = new ElectricBike("1230ABCD5670");
        Chargeable electricVeh4 = new ElectricBike("1230ABCD5670");
        veh4.start();
        electricVeh4.ChargeBattery();
        veh4.stop();
    }
}