class NullStringException extends Exception{
    public NullStringException(){
        super("String cannot be null.");
    }

    public NullStringException(String str){
        super(str);
    }
}

class Sequence{
    private Object str;

    public Sequence(){}

    public Sequence(Object str){
        this.str = str;
    }

    public String changeToString() throws NullStringException{
        if(str == null) throw new NullStringException();

        return String.valueOf(str);
    }
}

class Test{
    public static void main(String args[]){
        Sequence seq = new Sequence(4.4);
        try{
            String str = seq.changeToString();
            System.out.println(str);
        }
        catch(NullStringException e){
            e.printStackTrace();
        }
    }
}