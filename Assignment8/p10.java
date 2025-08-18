import java.util.ArrayList;

class Student{
    private String name;
    private String grade;
    private ArrayList<String> courses = new ArrayList<String>();

    public Student(){}

    public Student(String name, String grade, String course){
        this.name = name;
        this.grade = grade;
        courses.add(course);
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGrade(String grade){
        this.grade = grade;
    }

    public void addCourse(String course){
        courses.add(course);
    }

    public void removeCourse(String course){
        courses.remove(course);
    }

    public void displayStudentDetails(){
        System.out.println("Name : " + this.name);
        System.out.println("Grade : " + this.grade);
        System.out.print("Courses : [");

        for(String course : courses){
            System.out.print(course + ", ");
        }

        System.out.println("]");
    }
}

class Test{
    public static void main(String args[]){
        Student s1 = new Student("Arjun", "B+", "Physics");
        s1.addCourse("Maths");
        s1.displayStudentDetails();
    }
}