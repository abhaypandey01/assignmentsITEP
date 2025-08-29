abstract class Employee{
    
    private int id;
    
    private String name;

    private int salary;

    public Employee(){}

    public Employee(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    abstract public int calculateSalary();

    public String showDetails(){
        return id+"\t"+name+"\t"+salary;
    }
}

class FullTimeEmployee{
    private int id;
    
    private String name;

    private int salary;

    public int calculateSalary(int salary){
        this.salary = salary;
        return this.salary;
    }

    public FullTimeEmployee(){}

    public FullTimeEmployee(int id, String name){
        super(id, name, calculateSalary());
        this.id = id;
        this.name = name;
        this.salary = calculateSalary();
    }
}

class PartTimeEmployee{
    private int id;
    
    private String name;

    private int salary;

    private int hour;

    private int rate;

    public int calculateSalary(int hour, int rate){
        this.salary = hour * rate;
        return this.salary;
    }

    public PartTimeEmployee(){}

    public PartTimeEmployee(int id, String name){
        super(id, name, calculateSalary());
        this.id = id;
        this.name = name;
        this.salary = calculateSalary();
    }
}