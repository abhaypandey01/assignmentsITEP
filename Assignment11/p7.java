interface Flyable{
    void fly();
}

abstract class Animal{
    private String name;
    private int age;

    public Animal(){}

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    abstract public String eat();

    abstract public String makeSound();

    public void showInfo(){
        System.out.println(this.name + " " + makeSound() + " and eats " + eat() + " and is " + this.age + " years old.");
    }
}

class Lion extends Animal{
    public Lion(){}

    public Lion(String name, int age){
        super(name, age);
    }

    public String eat(){
        return "flesh";
    }

    public String makeSound(){
        return "roars";
    }
}

class Elephant extends Animal{
    public Elephant(){}

    public Elephant(String name, int age){
        super(name, age);
    }

    public String eat(){
        return "sugarcane mainly";
    }

    public String makeSound(){
        return "trumphets";
    }
}

class Parrot extends Animal implements Flyable{
    public Parrot(){}

    public Parrot(String name, int age){
        super(name, age);
    }

    public String eat(){
        return "fruits and nuts";
    }

    public String makeSound(){
        return "chirps";
    }

    public void fly(){
        System.out.println(getName() + " can fly also.");
    }
}

class Test{
    public static void main(String args[]){
        Lion lio = new Lion("Tuff", 10);
        Animal lio_animal = lio;

        lio_animal.showInfo();

        Elephant el = new Elephant("Baburao", 12);
        Animal el_animal = el;

        el_animal.showInfo();

        Parrot par = new Parrot("Pappu", 1);
        Animal par_animal = par;
        Flyable par_fly = par;

        par_animal.showInfo();
        par_fly.fly();
    }
}