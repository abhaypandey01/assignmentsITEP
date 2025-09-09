class Sequence{
    public static String replaceSub(String str, String target, String replacement){
        StringBuffer newStr = new StringBuffer();
        int i = 0;
        while(i < str.length()){
            if(i + target.length() <= str.length() && str.substring(i , i + target.length()).equals(target)){
                newStr.append(replacement);
                i += target.length();
            } else {
                newStr.append(str.charAt(i));
                i++;
            }
        }
        return newStr.toString();
    }
}

class Test{
    public static void main(String args[]){
        String str = Sequence.replaceSub("hello world", "hello", "yo");
        System.out.println(str);
    }
}