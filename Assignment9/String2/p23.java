class Sequence{
    public static String removeSpaces(String str){
        char ch[] = str.toCharArray();
        int n = ch.length;
        for(int i = 0, j = n - 1; true;){
            if(ch[i] != ' ' && ch[j] != ' ') break;
            if(ch[i] == ' '){
                ch[i] = '\0';
                i++;
            }
            if(ch[j] == ' '){
                ch[j] = '\0';
                j--;
            }
        }

        return new String(ch);
    }
}

class Test{
    public static void main(String args[]){
        String str = "   abhay  pandey ";

        Sequence seq = new Sequence();
        System.out.println(seq.removeSpaces(str));
    }
}