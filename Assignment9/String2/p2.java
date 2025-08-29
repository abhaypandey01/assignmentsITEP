class Sequence{
    private String str;

    public Sequence(String str){
        this.str = str;
    }

    public Sequence(){}

    public char getChar(int i){
        char ch[] = str.toCharArray();

        for(int j = 0; j < ch.length; j++){
            if(j == i) return ch[j];
        }
        return '\0';
    }
}

class Test{
    public static void main(String args[]){
        Sequence seq = new Sequence("Aman");

        char ch = seq.getChar(2);

        System.out.println("The char at 2 index : " + ch);

    }
}