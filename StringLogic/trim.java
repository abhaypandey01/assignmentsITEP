class Test{

    static String trimString(String str){
        char[] ch = str.toCharArray();
        char[] newCh = new char[ch.length];
        int k = 0;

        for(int i = 1; i < ch.length - 1; i++){
            if((ch[i] != 32 || ch[i-1] != 32) && (ch[i] != 32 || ch[i+1] != 32)){
                newCh[k] = ch[i];
                k++;
            }
        }

        String newStr = new String(newCh);

        return newStr;
    }

    public static void main(String aegs[]){
        String str = "  Abc  123  ";
        String str2 = str.trim();
        String n = trimString(str);
        System.out.println(n);
        System.out.println(str2);

    }
}