class Test{

    static void countVowels(String str){
        str = str.toLowerCase();
        int cnt = 0;
        
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if("aeiou".contains(ch + "")){
                cnt++;
            }

        }

        System.out.println("Entered  name " + str + " contains "+ cnt + " vowels.");
    }

    public static void main(String args[]){
        String str = "Arman Malik";
        countVowels(str);
    }
}