class Sequence{
    private String str;

    public Sequence(){
    }

    public Sequence(String str){
        this.str = str;
    }

    public String replaceChar(char ch1, char ch2){
        char ch[] = str.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == ch1) ch[i] = ch2;
        }

        return new String(ch);
    }
}

class Test{
    public static void main(String args[]){
        Sequence seq = new Sequence("Hello world");
        String str = seq.replaceChar('e', 'a');
        System.out.println(str);
    }
}