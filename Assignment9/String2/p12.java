class Sequence{
    private String str;


    public Sequence(String str2){
        this.str = str;
    }

    public boolean equalsTo(String str2){
        if(str2 == null || str2.length() > str.length()) return false;

        if(str2.length() == str.length()){
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) != str2.charAt(i)) return false;
            }
            return true;
        } else return false;
    }
}

class Test{
    public static void main(String args[]){
        Sequence seq = new Sequence("Hello");
        seq.equalsTo("ello");
    }
}