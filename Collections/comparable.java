import java.util.*;

class Test{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,35,6,5,4,5,7,99,4));
        for(Integer i : list) System.out.print(i + ", ");
        System.out.println();
        Collections.sort(list);
        for(Integer i : list) System.out.print(i + ", ");

    }
}