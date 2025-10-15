import java.util.*;
class Test{
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            al.add(i);
        }

        al.removeIf(e -> e % 2 == 0);

        for(Integer i : al){
            System.out.println(i);
        }
    }
}

class Test1{
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            al.add(i);
        }

        // al.removeIf(e -> e % 2 == 0);
        for(int i = al.size()-1; i >= 0; i--){
            int a = al.get(i);
            System.out.print(a + " ");
        }

        // for(Integer i : al){
        //     System.out.println(i);
        // }
    }
}

class Test2{
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            al.add(i);
        }
        int k = 17;
        // al.removeIf(e -> e % 2 == 0);

        if(al.contains(k)) System.out.println("Element found");
        else System.out.println("Element not found");

        // for(Integer i : al){
        //     System.out.println(i);
        // }
    }
}

class Test3{
    public static void main(String args[]){
        LinkedList<Integer> llist = new LinkedList<>();
        llist.add(1);
        llist.add(3);
        llist.add(4);
        llist.add(2);

        for(Integer i : llist)
        System.out.println(i);

        Iterator<Integer> itr = llist.iterator();

        while(itr.hasNext()){
            Integer i = itr.next();
            if(i == 3) itr.remove();
        }

        for(Integer i : llist)
        System.out.println(i);

    }
}