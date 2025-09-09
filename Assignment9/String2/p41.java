class NullStringException extends Exception{
    public NullStringException(){
        super("String cannot be null, given String is null.");
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

    public String trimmedString() throws NullStringException{
        if(str == null) throw new NullStringException();

        str = str.trim();

        return str;
    }
}

class Test{
    public static void main(String args[]){
        Sequence seq = new Sequence();
        try{
            String str = seq.trimmedString();
            System.out.println(str);
        } catch(NullStringException e){
            System.out.println(e);
        }
    }
}