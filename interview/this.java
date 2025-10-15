class Student{
    private int id;
    private String name;

    public Student(){}

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Student setStudent(int id, String name){
        this.id = id;
        this.name = name;
        return this;
    }

    public void display(){
        System.out.println(this.id+" : "+this.name);
    }
}

class Test{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.setStudent(1, "Abhay").display();
        s1.setStudent(2, "Krishna").display();
    }
}