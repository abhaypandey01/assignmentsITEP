class Sequence{
    private char[] ch;

    public Sequence(char[] ch){
        this.ch = ch;
    }

    public Sequence(){}

    public String getString(){
        return new String(ch);
    }
}

class Test{
    public static void main(String args[]){
        char ch[] = {'a','b','h','a','y'};
        Sequence seq = new Sequence(ch);

        String str = seq.getString();

        System.out.println("**" + str + "**");

    }
}