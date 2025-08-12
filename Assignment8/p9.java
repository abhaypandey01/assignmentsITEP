/**
 * . Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes, and a method to calculate years of service.
 */

class Employee{
    private String name;
    private int salary;
    private int date;
    private int month;
    private int year;

    public Employee(){}

    public Employee(String name, int salary, int date, int month, int year){
        this.name = name;
        this.salary = salary;
        this.date = date;
        this.month = month;
        this.year = year;
    }

    public void setName(String name){
        this.name = name;
    }

    public void displayDetails(){
        System.out.println(name + " : " + salary + "Rs.  : " + date +"/" + month +"/" + year);
    }

    public static void serviceYears(Employee emp){
        int years = 2025 - emp.year;
        System.out.println("The employee " + emp.name + " has provided " + years + " years of services");
    }
}

class Test{
    public static void main(String args[]){
        Employee emp1 = new Employee("Arjun", 25000, 12, 3, 2022);
        emp1.displayDetails();
        Employee.serviceYears(emp1);
    }
}