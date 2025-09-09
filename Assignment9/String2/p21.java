class Sequence{
    public static String subStr(String str, int start, int end){
        StringBuffer result = new StringBuffer();
        for(int i = 0; i < str.length(); i++){
            if(i >= start && i <= end) result.append(str.charAt(i));
        }

        return result.toString();
    }
}

class Test{
    public static void main(String args[]){
        String str = Sequence.subStr("Hello world", 2, 5);
        System.out.println(str);
    }
}