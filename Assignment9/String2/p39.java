class Sequence{
    public static String changeToLowercase(String str){

        if(str == null || str.isEmpty()) return "";

        char ch[] = str.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(ch[i] >= 'A' && ch[i] <= 'Z'){
                ch[i] = (char)(ch[i] + 32);
            }
        }

        return new String(ch);
    }
}

class Test{
    public static void main(String args[]){
        String str = Sequence.changeToLowercase("Hello World!");
        System.out.println(str);
    }
}