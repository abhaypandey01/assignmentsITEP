class Test{

    static void stratingWithVowel(String str){
        char[] ch = str.toCharArray();
        int n = ch.length;
        int cnt = 0;

        for(int i = 1; i < n; i++){
            if(ch[i - 1] == 32 && ch[i] == 'A' || ch[i - 1] == 32 && ch[i] == 'E' || ch[i - 1] == 32 && ch[i] == 'I' || ch[i - 1] == 32 && ch[i] == 'O' || ch[i - 1] == 32 && ch[i] == 'U' || ch[i - 1] == 32 && ch[i] == 'a' || ch[i - 1] == 32 && ch[i] == 'e' || ch[i - 1] == 32 && ch[i] == 'i' || ch[i - 1] == 32 && ch[i] == 'o' || ch[i - 1] == 32 && ch[i] == 'u') cnt++;
        }

        if(ch[0] == 'A' || ch[0] == 'E' || ch[0] == 'I' || ch[0] == 'O' || ch[0] == 'U' ||
            ch[0] == 'a' || ch[0] == 'e' || ch[0] == 'i' || ch[0] == 'o' || ch[0] == 'u'
            ) cnt++;

        System.out.println(cnt +" words starting with vowel.");
    }

    public static void main(String args[]){
        String str = "aabbsdsds cddcddd eeef dmnkfir";
        stratingWithVowel(str);
    }
}