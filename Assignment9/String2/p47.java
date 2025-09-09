class NullStringException extends Exception{
    public NullStringException(){
        super("String cannot be null.");
    }

    public NullStringException(String str){
        super(str);
    }
}

class Sequence{
    private char[] ch;
    public Sequence(){}

    public Sequence(char[] ch){
        this.ch = ch;
    }

    public String toString(){
        return new String(ch);
    }
}

class Test{
    public static void main(String args[]){
        char ch[] = {'a','b','h','a','y'};
        Sequence seq = new Sequence(ch);
        String str = seq.toString();

        System.out.println(str.getClass().getName());
    }
}