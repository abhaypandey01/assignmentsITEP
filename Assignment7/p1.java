/*
Create a class Employee with private fields: id, name, and salary.
Use setter methods to assign values. Add a method to display employee details.
 */

class Employee{
    private int id;
    private String name;
    private int salary;

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }

    public void display(){
        System.out.print("Id \t\t Name \t\t Salary\n");
        System.out.print(id + "\t\t" + name + "\t\t" + salary);
    }
}

class Test{
    public static void main(String args[]){
        Employee obj = new Employee();
        obj.setId(123);
        obj.setName("Abhay");
        obj.setSalary(100000);
        obj.display();
    }
}