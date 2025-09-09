class Sequence{
    private String str;

    public Sequence(){}

    public Sequence(String str){
        this.str = str;
    }

    public boolean checkPalindrome(){
        char ch[] = str.toCharArray();
        String reverse = "";
        for(int i = ch.length - 1; i >= 0; i--){
            reverse += ch[i];
        }
        if(reverse.equals(str)) return true;
        return false;
    }
}

class Test{
    public static void main(String args[]){
        Sequence seq = new Sequence("tenet");
        boolean palindrome = seq.checkPalindrome();
        System.out.println(palindrome);
    }
}