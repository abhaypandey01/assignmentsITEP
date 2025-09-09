class Sequence{
    private String str1;
    private String str2;

    public Sequence(){}

    public Sequence(String str1, String str2){
        this.str1 = str1;
        this.str2 = str2;
    }

    public String getString1(){
        return str1;
    }

    public String getString2(){
        return str2;
    }

    public void swapStrings(){
        String temp = str1;
        str1 = str2;
        str2 = temp;
    }


}

class Test{
    public static void main(String args[]){
        Sequence seq = new Sequence("hello world", "java is simple");
        seq.swapStrings();
        String str1 = seq.getString1();
        String str2 = seq.getString2();
        System.out.println("After Swapping -");
        System.out.println("1st:\t" + str1 + "\t2nd:\t" + str2);
    }
}