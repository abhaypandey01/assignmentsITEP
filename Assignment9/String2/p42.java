class NullStringException extends Exception{
    public NullStringException(){
        super("String cannot be null.");
    }

    public NullStringException(String str){
        super(str);
    }
}

class Sequence{
    private String str;

    public Sequence(){}

    public Sequence(String str){
        this.str = str;
    }

    public String replacedString(String w1, String w2) throws NullStringException{
        if(str == null) throw new NullStringException();

        return str.replace(w1, w2);
    }
}

class Test{
    public static void main(String arg[]){
        Sequence seq = new Sequence("hello world");

        try{
            String str = seq.replacedString("world", "hello");
            System.out.println(str);
        } catch(NullStringException e){
            e.printStackTrace();
        }
    }
}