/*
Make list of Students having name, roll no., age, score. Write a program to accept 10 students record and arrange the Students based on the score group [0-50], [50-65],[65-80],[80-100].
 */
import java.util.ArrayList;

class Standard{
    private ArrayList<Student> slist80 = new ArrayList<Student>();
    private ArrayList<Student> slist65 = new ArrayList<Student>();
    private ArrayList<Student> slist50 = new ArrayList<Student>();
    private ArrayList<Student> slist0 = new ArrayList<Student>();



    public void addInGroup(Student s){
            if(s.getScore() > 80 && s.getScore() <= 100){
                slist80.add(s);
            } else if(s.getScore() > 65 && s.getScore() <= 80){
                slist65.add(s);
            } else if(s.getScore() > 50 && s.getScore() <=65){
                slist50.add(s);
            } else if(s.getScore() <= 50){
                slist0.add(s);
            }
    }

    public void displayGroup80(){
        System.out.println("Students of group 80");
        for(Student s : slist80) System.out.println(s.details());
    }

    public void displayGroup65(){
        System.out.println("Students of group 65");
        for(Student s : slist65) System.out.println(s.details());
    }

    public void displayGroup50(){
        System.out.println("Students of group 50");
        for(Student s : slist50) System.out.println(s.details());
    }

    public void displayGroup0(){
        System.out.println("Students of group less than 50");
        for(Student s : slist0) System.out.println(s.details());
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

class Test{
    public static void main(String args[]){
        Standard study = new Standard();
        Student st1 = new Student("Aman", 1001, 17, 98);
        study.addInGroup(st1);
        Student st2 = new Student("Ajay", 1002, 16, 67);
        study.addInGroup(st2);
        Student st3 = new Student("Arjun", 1003, 13, 51);
        study.addInGroup(st3);
        Student st4 = new Student("Cheeku", 1004, 13, 45);
        study.addInGroup(st4);

        Student st5 = new Student("Aman", 1001, 17, 90);
        study.addInGroup(st5);
        Student st6 = new Student("Aman", 1001, 17, 48);
        study.addInGroup(st6);
        Student st7 = new Student("Aman", 1001, 17, 28);
        study.addInGroup(st7);
        Student st8 = new Student("Aman", 1001, 17, 68);
        study.addInGroup(st8);

        Student st9 = new Student("Abhay", 1009, 17, 100);
        study.addInGroup(st9);
        Student st10 = new Student("Arun", 1010, 17, 88);
        study.addInGroup(st10);

        study.displayGroup0();
        study.displayGroup50();
        study.displayGroup65();
        study.displayGroup80();

    }
}