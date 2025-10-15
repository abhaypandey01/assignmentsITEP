import java.util.*;

class Test{
    public static void main(String args[]){
        HashSet<Integer> hs = new HashSet<>();
        int arr[] = {1,2,3,4,5,6,6,6,6,6,7,8,9,10};
        for(int i = 0; i < arr.length; i++){
            hs.add(arr[i]);
        }

        // hs.add(1);
        // hs.add("super");
        // hs.add(1);
        // hs.add(4.0f);
        // hs.add('a');


        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                hs.remove(arr[i]);
            }
        }

        for(Object i : hs){
            System.out.print(i + " ");
        }
    }
}

class Test1{
    public static void main(String args[]){
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        String[] movies = {"Spiderman", "Lord of the rings", "HAteful eight", "Django unchained"};
        for(int i =0; i < movies.length; i++){
            lhs.add(movies[i]);
        }

        for(String movie : lhs){
            System.out.print(movie + ", ");
        }
    }
}

class Test2{
    public static void main(String args[]){
        TreeSet<Integer> lhs = new TreeSet<>();
        Integer[] num = {3,5,6,3,1,4,67,5,4};
        for(int i =0; i < num.length; i++){
            lhs.add(num[i]);
        }

        for(Integer movie : lhs){
            System.out.print(movie + ", ");
        }
    }
}

class Test3{
    public static void main(String args[]){
        TreeSet<Integer> lhs = new TreeSet<>();
        Integer[] num = {3,5,6,3,1,4,67,5,4};
        for(int i =0; i < num.length; i++){
            lhs.add(num[i]);
        }

        Iterator<Integer> itr = lhs.iterator();

        while(itr.hasNext()){
            int value = itr.next();
            if(value == 5){
                itr.remove();
            }
        }

        for(Integer movie : lhs){
            System.out.print(movie + ", ");
        }
    }
}

/**
 * set = uniqueness
 * hashset = uniquiness + random order
 * linkehashet = uniqueness + insertion order maintain
 * treeset = uniquiness + sorted
 * 
 */