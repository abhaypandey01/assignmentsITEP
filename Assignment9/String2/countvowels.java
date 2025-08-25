class Test{

    static void countVowelAndConstant(String str){
        int cntvowel = 0;
        int cntconsonant = 0;
        for(char ch : str.toCharArray()){
            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') ){
                if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    cntvowel++;
                } else {
                    cntconsonant++;
                }
            }
        }
        System.out.println("Vowels : " + cntvowel + " Consonant : " + cntconsonant);
    }

    public static void main(String args[]){
        String str = "Hello";
        countVowelAndConstant(str);
    }
}