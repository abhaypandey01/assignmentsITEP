class Employee{
    private String name;
    private String title;
    private double salary;

    public Employee(){}

    public Employee(String name, String title, double salary){
        this.name = name;
        this.title = title;
        this.salary = salary;

    }

    public double calculate(double percent){
        return salary = salary + (salary * (percent/100));
    }

    public void displayDetails(){
        System.out.print(name+" : "+title+" : "+salary);
    }
}

class Test{
    public static void main(String args[]){
        Employee emp = new Employee("Arjun", "Product Manager", 60000);
        emp.displayDetails();
        double updatedSalary = emp.calculate(10);
        System.out.println("\nUpdated salary : "+updatedSalary);

    }
}