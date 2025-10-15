import java.util.*;

class Student{
    private int id;
    private String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public String toString(){
        return id+" - "+name;
    }
}

class nameComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s1.getName().compareTo(s2.getName());
    }
}

class idComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s1.getId() - s2.getId();
    }
}


class Test{
    public static void main(String arg[]){
        ArrayList<Student> list = new ArrayList<Student>(Arrays.asList(
            new Student(2, "A"),
            new Student(3, "D"),
            new Student(1, "C"),
            new Student(5, "B"),
            new Student(4, "E")
        ));

        // Collections.sort(list, new idComparator());
        Collections.sort(list, new nameComparator());


        for(Student s : list) System.out.println(s);

    }
}