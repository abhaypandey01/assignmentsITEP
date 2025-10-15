import java.util.*;
class Test{
    public static void main(String arg[]){
        LinkedList<String> list = new LinkedList<String>(Arrays.asList("Superman", "BAtman", "Aquaman"));
        // System.out.println(llist);
        ListIterator lit = list.listIterator();

        while(lit.hasNext()) System.out.print(lit.next() + ", ");

        System.out.println();

        while(lit.hasPrevious()) System.out.print(lit.previous() + ", ");

        lit.add("Spiderman");

        System.out.println(list);

    }
}

class Test1{
    public static void main(String arg[]){
        LinkedList<String> list = new LinkedList<String>(Arrays.asList("Spiderman","Aquaman"));
        
        list.addFirst("Superman");
        list.addLast("WonderWoman");

        System.out.println(list);

    }
}

class Test2{
    public static void main(String arg[]){
        LinkedList<String> list = new LinkedList<String>(Arrays.asList("Superman","Spiderman","Aquaman","Wonderwoman"));
        
        list.removeFirst();
        list.removeLast();

        System.out.println(list);

    }
}

class Test3{
    public static void main(String arg[]){
        LinkedList<String> list = new LinkedList<String>(Arrays.asList("Spiderman","Aquaman"));
        
        list.addFirst("Superman");
        list.addLast("WonderWoman");

        ArrayList list2 = new ArrayList(list);

        System.out.println(list2);

    }
}