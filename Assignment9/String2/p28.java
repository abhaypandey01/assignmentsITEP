class Sequence{
    private String str1;
    private String str2;

    public Sequence(){}

    public Sequence(String str1, String str2){
        this.str1 = str1;
        this.str2 = str2;
    }

    public void swapStrings(){
        str1 = str1 + str2;
        str2 = str1.substring(0,str1.length() - str2.length());
        str1 = str1.substring(str2.length());
    }

    public String toString(){
        return "1st:\t:"+str1+"\t2nd:\t"+str2;
    }
}

class Test{
    public static void main(String args[]){
        Sequence seq = new Sequence("Hello world", "Java is very simple");
        seq.swapStrings();
        String str = seq.toString();
        System.out.println(str);
    }
}