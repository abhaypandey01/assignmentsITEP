import java.util.ArrayList;

class School{
    ArrayList<Teacher> teachersList = new ArrayList<Teacher>();
    ArrayList<Standard> classesList = new ArrayList<Standard>();

    public void addStandard(Standard std){
        classesList.add(std);
    }

    public void addTeacher(Teacher teach){
        teachersList.add(teach);
    }

    public void removeTeacher(Teacher teach){
        teachersList.remove(teach);
    }

    public void displayAllTeachers(){
        System.out.println("Id\t\tName\t\tSubject");
        for(Teacher teach : teachersList){
            System.out.println(teach.teacherDetails());
        }
    }

    public void displayAllClasses(){
        for(Standard std : classesList){
            System.out.println("All students of Standard : " + std.getClassName());
            std.displayAllStudents();
        }
    }
}

class Student{
    private int roll;
    private String name;
    private String grade;
    private static int count = 1;

    public Student(){ 
        this.roll = count;
        count++;
    }

    public Student(String name, String grade){
        this.name = name;
        this.grade = grade;
        this.roll = count;
        count++;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public String studentDetails(){
        return roll+"\t\t"+name+"\t\t"+grade;
    }

}

class Teacher{
    private int id;
    private String name;
    private String subject;
    private static int count = 1;

    public Teacher(){
        this.id = count;
        count++;
    }

    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
        this.id = count;
        count++;
    }

    public void setName(){
        this.name = name;
    }

    public void setSubject(){
        this.subject = subject;
    }

    public String getName(){
        return this.name;
    }

    public String getSubject(){
        return this.subject;
    }

    public String teacherDetails(){
        return id+"\t\t"+name+"\t\t"+subject;
    }

}

class Standard{
    private String className;
    ArrayList<Student> classes = new ArrayList<Student>();

    public Standard(){}

    public Standard(String className){
        this.className = className;
    }

    public String getClassName(){
        return this.className;
    }

    public void addStudent(Student s){
        classes.add(s);
    }

    public void removeStudent(Student s){
        classes.remove(s);
    }

    public void displayAllStudents(){
        System.out.println("Roll no.\tName\t\tGrade");
        for(Student st : classes){
            System.out.println(st.studentDetails());
        }
    }
}

class Test{

    static void createTeacher(String name[], String subject[]){
        Teacher teach[] = new Teacher[1];
        teach[0] = new Teacher(name[0], subject[0]);
        School scl = new School();
        scl.addTeacher(teach[0]);
        scl.displayAllTeachers();

    }

    static void createStandard(String name[], String grade[], String className[]){
        Student[] std = new Student[1];
        std[0] = new Student(name[0], grade[0]);

        Standard[] study = new Standard[1];
        study[0] = new Standard(className[0]);
        study[0].addStudent(std[0]);
        
        School scl = new School();
        scl.addStandard(study[0]);
        scl.displayAllClasses();
    }

    public static void main(String args[]){
        String[] studentName = {"Animesh"}, grade = {"B+"}, className = {"10th"};
        createStandard(studentName, grade, className);

        String name[] = {"Arman"}, subject[] = {"Maths"};
        createTeacher(name, subject);

    }
}