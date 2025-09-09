//37. Write a Java program to check if the letter 'x' is present in the word 'String Exercises'
class Sequence{
    private String str;

    public Sequence(){}

    public Sequence(String str){
        this.str = str;
    }

    public boolean charContains(char c){
        char ch[] = str.toCharArray();
        if(str == null || str.isEmpty()) return false;

        for(int i = 0; i < ch.length; i++){
            if(ch[i] == c) return true;
        }

        return false;
    }
}

class Test{
    public static void main(String args[]){
        Sequence seq = new Sequence("String exercises");
        boolean flag = seq.charContains('x');
        System.out.println("Contains : " + flag);
    }
}