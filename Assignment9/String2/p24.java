class Sequence{
    public static String doubleChar(String str){
        if(str == null || str.isEmpty()) return "";

        StringBuffer sb = new StringBuffer();
        char ch[] = str.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == ' '){
                sb.append(ch[i]);
                
            } else {
                sb.append(ch[i]);
                sb.append(ch[i]);
            }

        }

        return sb.toString();
    }
}

class Test{
    public static void main(String args[]){
        String str = Sequence.doubleChar("str one");

        System.out.println(str);
    }
}