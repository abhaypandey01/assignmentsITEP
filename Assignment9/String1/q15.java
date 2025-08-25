class Test{

    static boolean isAnagram(String str){
        char[] ch1 = str.toCharArray();

        for(int i = 0; i < ch1.length; i++){
            if(ch1[i] != ch2[i]) return false;
        }

        return true;
    }

    public static void main(String aegs[]){
        String str = "Abcd";
        String str2 = "bcA";
        boolean isCorrect = isAnagram(str, str2);
        System.out.println(isCorrect);
    }
}