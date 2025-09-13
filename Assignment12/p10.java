import java.io.*;
import java.util.*;

class Test{
    public static void main(String args[]){
        File f = new File("java1");
        try(
            Scanner sc = new Scanner(f)
        ){
            if(sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}