class Test{

    static String removeDuplicates(String str){
        char[] ch = str.toCharArray(), newCh = new char[ch.length];
        int k = 0;

        System.out.println(ch);

        for(int i = 0; i < ch.length - 1; i++){
            if(ch[i] != ch[i+1]){
                newCh[k] = ch[i];
                k++;
            }
        }
        newCh[k+1] = ch[ch.length - 1];

        String newStr = new String(newCh);

        return newStr;
    }

    public static void main(String args[]){
        String str = "aabbccdddeeeef";
        String str2 = removeDuplicates(str);
        System.out.println(str2);
    }
}