class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Person(){}

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }
}

class Test{
    public static void main(String[] args){
        Person personOne = new Person("Ram", 19);
        Person personTwo = new Person("Shyam", 29);
        personOne.display();
        personTwo.display();
    }
}