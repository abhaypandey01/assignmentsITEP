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

    public boolean isEquals(String str2) throws NullStringException{
        if(str == null || str2 == null) throw new NullStringException();
        return str.equals(str2);
    }

    public int comparesToString(String str2) throws NullStringException{
        if(str == null || str2 == null) throw new NullStringException();
        return str.compareTo(str2);
    }

    public boolean doubleEquals(String str2) throws NullStringException{
        if(str == null || str2 == null) throw new NullStringException();
        return str == str2;
    }

}

class Test{
    public static void main(String args[]){
        Sequence seq = new Sequence("hello");
        String str = new String("hello");
        try{
            boolean result_1 = seq.isEquals(str);
            int result_2 = seq.comparesToString(str);
            boolean result_3 = seq.doubleEquals(str);
            System.out.println(result_1);
            System.out.println(result_2);
            System.out.println(result_3);

        } catch(NullStringException e){
            System.out.println(e);
        }
    }
}