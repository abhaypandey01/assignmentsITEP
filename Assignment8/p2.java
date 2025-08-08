class Dog{
    private String name;
    private String breed;

    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    public Dog(){}

    public void setName(String name){
        this.name = name;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }

    public void display(){
        System.out.println("Name : " + this.name);
        System.out.println("Breed : " + this.breed);
    }
}

class Test{
    public static void main(String[] args){
        Dog dogOne = new Dog("Rocky", "German Shephard");
        Dog dogTwo = new Dog("Balboa", "Pitbull");
        dogOne.setName("Tarzan");
        dogOne.setBreed("Golden retriever");
        dogOne.display();
        dogTwo.display();
    }
}