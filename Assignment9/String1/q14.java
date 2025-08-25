class Test{

    static boolean isAnagram(String str, String str2){
        char[] ch1 = str.toCharArray();
        char[] ch2 = str2.toCharArray();

        char[] newCh = new char[ch1.length];
        char[] newCh2 = new char[ch2.length];

        if(newCh.length != newCh2.length) return false;

        for(int i = 0; i < ch1.length; i++){
            for(int j = 0; j < ch1.length - 1 - i; j++){
                if(ch1[j] > ch1[j+1]){
                    char temp = ch1[j];
                    ch1[j] = ch1[j+1];
                    ch1[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < ch2.length; i++){
            for(int j = 0; j < ch2.length - 1 - i; j++){
                if(ch2[j] > ch2[j+1]){
                    char temp = ch2[j];
                    ch2[j] = ch2[j+1];
                    ch2[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < ch1.length; i++){
            if(ch1[i] != ch2[i]) return false;
        }

        // newCh[newCh.length - 1] =
        return true;
    }

    public static void main(String aegs[]){
        String str = "Abcd";
        String str2 = "bcA";
        boolean isCorrect = isAnagram(str, str2);
        System.out.println(isCorrect);
    }
}