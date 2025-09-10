import java.util.*;

class StudentNotFoundException extends Exception{
    public StudentNotFoundException(){
        super("Student not found!!!");
    }
}

class Study{
    ArrayList<Student> sl = new ArrayList<>();

    public void addStudent(Student s){
        sl.add(s);
    }

    public void fetchStudent(int i) throws StudentNotFoundException{
        for(Student s1 : sl){
            if(s1.getId() == i)System.out.println(s1.display());
            else throw new StudentNotFoundException();
        }
    }
}

class Student{
    private int id;
    private String name;
    
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String display(){
        return id+" "+name;
    }

}

class Test{
    public static void main(String arg[]){
        Student st1 = new Student(1, "Prem");
        Study s1 = new Study();
        s1.addStudent(st1);
        try{
            s1.fetchStudent(1);
            // System.out.println(sname);
        } catch(StudentNotFoundException e){
            e.printStackTrace();
        }
    }
}
