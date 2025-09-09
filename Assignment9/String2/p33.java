class Sequence{
    private String str;

    public Sequence(){}

    public Sequence(String str){
        this.str = str;
    }

    public char maximumOccuring(){
        if(str == null || str.isEmpty()) return '\0';
        char ch[] = str.toCharArray();
        boolean flag[] = new boolean[ch.length];
        int maxIndex = 0;
        int count = 0;

        for(int i = 0; i < ch.length-1; i++){
            count = 0;
            if(flag[i] == true) continue;

            for(int j = i+1; j < ch.length; j++){
                if(ch[i] == ch[j]){
                    count++;
                    flag[j] = true;
                }
            }
            if(count > maxIndex) maxIndex = i;
        }
        return ch[maxIndex];
    }
}

class Test{
    public static void main(String args[]){
        Sequence seq = new Sequence();
        char ch = seq.maximumOccuring();
        System.out.println(ch);
    }
}