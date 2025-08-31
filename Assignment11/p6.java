interface SmartDevice{
    void connectWifi();
}

abstract class Appliances{
    private String brandName;
    private boolean power;

    public Appliances(){}

    public Appliances(String brandName){
        this.brandName = brandName;
        this.power = false;
    }

    public void setPower(boolean a){
        if(a)
        this.power = true;
        else
        this.power = false;
    }

    public String getBrandName(){
        return this.brandName;
    }

    public boolean getPower(){
        return this.power;
    }

    abstract public void turnOn();

    abstract public void turnOff();

    public void showStatus(){
        if(this.power) System.out.println(this.brandName + " is now turned on.");
        else System.out.println(this.brandName + " is now turned off.");
    }

}

class Fan extends Appliances{
    public Fan(){}

    public Fan(String brandName){
        super(brandName);
    }

    public void turnOn(){
        setPower(true);
    }

    public void turnOff(){
        setPower(false);
    }
}

class Light extends Appliances implements SmartDevice{
    public Light(){}

    public Light(String brandName){
        super(brandName);
    }

    public void turnOn(){
        setPower(true);
    }

    public void turnOff(){
        setPower(false);
    }

    public void connectWifi(){
        System.out.println(getBrandName() + " light is now connected to wife.");
    }
}

class WashingMachine extends Appliances implements SmartDevice{
    public WashingMachine(){}

    public WashingMachine(String brandName){
        super(brandName);
    }

    public void turnOn(){
        setPower(true);
    }

    public void turnOff(){
        setPower(false);
    }

    public void connectWifi(){
        System.out.println(getBrandName() + " washing machine is now connected to wifi network.");
    }
}

class Test{
    public static void main(String args[]){
        Fan f1 = new Fan("Orient");
        Appliances f1_power = f1;

        f1_power.turnOn();
        f1_power.showStatus();
        f1_power.turnOff();
        f1_power.showStatus();

        WashingMachine w1 = new WashingMachine("Haeir");
        Appliances w1_power = w1;
        SmartDevice w1_wifi = w1;

        w1_power.showStatus();
        w1_power.turnOn();
        w1_power.showStatus();
        w1_wifi.connectWifi();
    }
}