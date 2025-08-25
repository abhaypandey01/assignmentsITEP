// class Test{

//     static int getLength(String str){
//         char[] ch = str.toCharArray();
//         int cnt = 0;
//         for(char c : ch) cnt++;

//         return cnt;
//     }

//     public static void main(String aegs[]){
//         String str = "Abc";
//         int n = getLength(str);
//         System.out.println(n);
//     }
// }

class Test{

    public static void main(String args[]){
        String str = "sjdkbuig";
        char[] ch = str.toCharArray();
        int n = 0;

        for(char c : ch){
            n++;
        }

        System.out.println(n);
    }
}


/*
 * "JAva is very simple."
 * output :-  "avaj si yrev elpmis."
 * "elpmis yrev si avaj."
 */