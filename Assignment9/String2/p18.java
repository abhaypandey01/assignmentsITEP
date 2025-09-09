class Sequence{
    private String str;

    public Sequence(){}

    public Sequence(String str){
        this.str = str;
    }

    public int lengthOfString(){
        int count = 0;
        for(char ch : str.toCharArray()) count++;

        return count;
    }
}

class Test{
    public static void main(String args[]){
        Sequence seq = new Sequence("Hello World.");
        int count = seq.lengthOfString();
        System.out.println(count);
    }
}