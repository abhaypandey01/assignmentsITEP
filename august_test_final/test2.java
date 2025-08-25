import java.util.ArrayList;

class Sequence{
    public static String reverseString(String str){
        char[] chArr = str.toCharArray();
        int i = 0, j = chArr.length - 1;
        while(i < j){
            char temp = chArr[i];
            chArr[i] = chArr[j];
            chArr[j] = temp;
            i++;
            j--;
        }

        return new String(chArr);

    }
}

class Test{
    public static void main(String args[]){
        String str1 = "Java is platform independent";
        String str2 = "";
        String[] arr = str1.split(" ");
        
        for(String element : arr){
            str2 += Sequence.reverseString(element) + " ";
        }
        
        System.out.println(str2);
    }
}