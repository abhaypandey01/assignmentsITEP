class Sequence{
    private char[] ch;

    public Sequence(){}

    public Sequence(char[] ch){
        this.ch = ch;
    }

    public String toCharArrayInLowerCase(){
        for(int i = 0; i < ch.length; i++){
            if(ch[i] >= 'A' && ch[i] <= 'Z'){
                ch[i] = (char)(ch[i] + 32);
            }
        }

        String str = new String(ch);

        return str;

    }
}

class Test{
    public static void main(String args[]){
        char ch[] = {'a', 'B', 'H', 'a', 'Y'};
        Sequence seq = new Sequence(ch);
        System.out.println(seq.toCharArrayInLowerCase());
    }
}