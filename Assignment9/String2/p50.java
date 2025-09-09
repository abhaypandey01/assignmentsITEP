import java.util.StringTokenizer;

class Sequence{
    private String str;

    public Sequence(){}

    public Sequence(String str){
        this.str = str;
    }

    public void separateTokens(){
        StringTokenizer st = new StringTokenizer(str);

        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}

class Test{
    public static void main(String args[]){
        String str = "Java is fuckin cool.";
        Sequence seq = new Sequence(str);
        seq.separateTokens();
    }
}