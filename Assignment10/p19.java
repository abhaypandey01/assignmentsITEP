/*
Make list of Students having name, roll no., age, score. Write a program to accept 10 students record and arrange the Students based on the score group [0-50], [50-65],[65-80],[80-100].
 */
import java.util.ArrayList;

class Standard{
    private ArrayList<Student> slist80 = new ArrayList<Student>();
    private ArrayList<Student> slist65 = new ArrayList<Student>();
    private ArrayList<Student> slist50 = new ArrayList<Student>();


    public void addInGroup(Student s){
            if(s.getScore() > 80){
                slist80.add(s);
            } else if(s.getScore() > 65){
                slist65.add(s);
            } else if(s.getScore() > 50){
                slist50.add(s);
            }
    }

    public void displayGroup80(){
        System.out.println("Students pf group 80");
        for(Student s : slist80) System.out.println(s.details());
    }

    public void displayGroup65(){
        System.out.println("Students pf group 65");
        for(Student s : slist65) System.out.println(s.details());
    }

    public void displayGroup50(){
        System.out.println("Students pf group 50");
        for(Student s : slist50) System.out.println(s.details());
    }
}

class Student{

    private String name;
    private int rollno;
    private int age;
    private int score;

    public Student(String name, int rollno, int age, int score){
        this.name = name;
        this.rollno = rollno;
        this.age = age;
        this.score = score;
    }

    public int getScore(){
        return score;
    }

    public String details(){
        return name+" : "+rollno+" : "+age+" : "+" : "+score;
    }

}