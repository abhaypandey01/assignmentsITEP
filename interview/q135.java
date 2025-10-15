import java.util.*;

class Test{
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        for(Integer i : al){
            System.out.println(i);
        }
        System.out.println("-------------------------");
        Iterator<Integer> itr = al.iterator();
        while(itr.hasNext()){
            Integer i = itr.next();
            System.out.println(i);
        }
    }
}