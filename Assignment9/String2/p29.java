class Sequence{
    private String str;

    public Sequence(){}

    public Sequence(String str){
        this.str = str;
    }

    public String reverseIt(String str2){
        String rev = "";
        char ch[] = str2.toCharArray();
        for(int i = ch.length - 1; i >= 0; i--){
            rev += ch[i];
        }

        return rev;
    }

    public String reverseWords(){
        String strArray[] = str.split(" ");
        String newstr = "";
        for(int i = 0; i < strArray.length; i++){
            String rev = reverseIt(strArray[i]);
            newstr = newstr + " " + rev;
        }

        return newstr;
    }
}

class Test{
    public static void main(String args[]){
        Sequence seq = new Sequence("Java");
        String str  = seq.reverseWords();
        System.out.println(str);
    }
}