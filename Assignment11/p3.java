abstract class Employee{
    private int id;
    private String name;
    private int salary;

    public Employee(){}

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public int getSalary(){
        return this.salary;
    }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }

    abstract public void calculateSalary();

    public String showDetails(){
        return id+"\t"+name+"\t"+salary;
    }
}

interface BonusEligible{
    void giveBonus(int b);
}

class FullTimeEmployee extends Employee implements BonusEligible{
    private int fixedSalary;

    public FullTimeEmployee(){}

    public FullTimeEmployee(int id, String name, int fixedSalary){
        super(id, name);
        this.fixedSalary = fixedSalary;
    }

    public void calculateSalary(){
        setSalary(fixedSalary);
    }

    public void giveBonus(int b){
        setSalary(getSalary() + b);
        System.out.println(getName() + " is eligible for bonus: " + getSalary());
    }

}

class PartTimeEmployee extends Employee implements BonusEligible{
    private int hour;

    private int rate;

    public PartTimeEmployee(){}

    public PartTimeEmployee(int id, String name, int hour, int rate){
        super(id, name);
        this.hour = hour;
        this.rate = rate;
    }

    public void calculateSalary(){
        setSalary(rate*hour);
    }

    public void giveBonus(int b){
        setSalary(getSalary() + b);
        System.out.println(getName() + " is eligible for the bonus of " + getSalary());
    }
}

class Intern extends Employee {
    private int stipend;

    public Intern(){}

    public Intern(int id, String name, int stipend){
        super(id, name);
        this.stipend = stipend;
    }

    public void calculateSalary(){
        setSalary(stipend);
    }

}

class Test{
    public static void main(String args[]){
        FullTimeEmployee emp1 = new FullTimeEmployee(123, "Shivam", 12000);
        Employee employee1 = emp1;
        BonusEligible bonus1 = emp1;
        employee1.calculateSalary();
        bonus1.giveBonus(1000);
        String detail = employee1.showDetails();
        System.out.println(detail);
    }
}