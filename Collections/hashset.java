import java.util.*;

class Employee implements Comparable<Employee>{
    private String name;
    private int id;

    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public String toString(){
        return id+" "+name;
    }

    public int compareTo(Employee e){
        return this.name.compareTo(e.name);
    }

}

// class nameComparator implements Comparator<Employee>{
//     public int compare(Employee e1, Employee e2){
//         return e1.getName().compareTo(e2.getName());
//     }
// }

// class idComparator implements Comparator<Employee>{
//     public int compare(Employee e1, Employee e2){
//         return e1.getId() - e2.getId();
//     }
// }

class Test{
    public static void main(String args[]){
        // HashSet<Integer> hs = new HashSet<>();
        // hs.add(1);
        // hs.add(3);
        // hs.add(5);
        // hs.add(3);
        // hs.add(1);

        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        hs.add(1);
        hs.add(3);
        hs.add(5);
        hs.add(3);
        hs.add(1);

        Iterator<Integer> itr = hs.iterator();

        while(itr.hasNext()){
            System.out.print(itr.next() + " ");
        }
    }
}

class Test1{
    public static void main(String args[]){
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(100);
        ts.add(110);
        ts.add(105);
        ts.add(55);
        ts.add(100);

        Iterator<Integer> itr= ts.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}

class Test2{
    public static void main(String argg[]){
        LinkedList<Employee> ts = new LinkedList<>();
        ts.add(new Employee("Siddhi", 2));
        ts.add(new Employee("Shivam", 3));
        ts.add(new Employee("Abhay", 1));

        // Collections.sort(ts, new idComparator());
        Collections.sort(ts);

        Iterator<Employee> itr= ts.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}