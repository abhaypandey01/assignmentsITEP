class Sequence{
    public static String changeToUppercase(String str){

        if(str == null || str.isEmpty()) return "";

        char ch[] = str.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(ch[i] >= 'a' && ch[i] <= 'z'){
                ch[i] = (char)(ch[i] - 32);
            }
        }

        return new String(ch);
    }
}

class Test{
    public static void main(String args[]){
        String str = Sequence.changeToUppercase("Hello World!");
        System.out.println(str);
    }
}