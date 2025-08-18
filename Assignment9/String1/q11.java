class Test{

    static void stratingWithVowel(String str){
        char[] ch = str.toCharArray();
        int n = ch.length;
        boolean flag = false;

        if(ch[0] == 'A' || ch[0] == 'E' || ch[0] == 'I' || ch[0] == 'O' || ch[0] == 'U' ||
            ch[0] == 'a' || ch[0] == 'e' || ch[0] == 'i' || ch[0] == 'o' || ch[0] == 'u'
            ) flag = true;

        System.out.println("Given name starts with vowel ?\n" + flag);
    }

    public static void main(String args[]){
        String str = "aabbsd mnkfir";
        stratingWithVowel(str);
    }
}