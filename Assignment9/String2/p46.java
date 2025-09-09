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

    public String firstLetterCapital() throws NullStringException{
        if(str == null) throw new NullStringException();
        char ch[] = str.toCharArray();

        for(int i = 0; i < ch.length - 1; i++){
            if(ch[0] >= 'a' && ch[0] <= 'z') ch[0] = (char)(ch[0] - 32);
            if(ch[i] == ' ' && (ch[i+1] >= 'a' && ch[i+1] <= 'z')) ch[i+1] = (char)(ch[i+1] - 32);
        }

        return new String(ch);
    }
}

class Test{
    public static void main(String args[]){
        Sequence seq =  new Sequence("hello world java is wondeful.");
        try{
            String str = seq.firstLetterCapital();
            System.out.println(str);
        } catch(NullStringException e){
            e.printStackTrace();
        }
    }
}