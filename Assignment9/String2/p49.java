class NullStringException extends Exception{
    public NullStringException(){
        super("String cannot be null.");
    }

    public NullStringException(String str){
        super(str);
    }
}

class Sequence{
    public static boolean isAnagram(String str1, String str2) throws NullStringException{

        if(str1 == null || str2 == null) throw new NullStringException();

        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();

        if(ch1.length != ch2.length) return false;

        for(int i = 0; i < ch1.length; i++){
            for(int j = 0; j < ch1.length - i - 1; j++){
                if(ch1[j] > ch1[j+1]){
                    char temp = ch1[j];
                    ch1[j] = ch1[j+1];
                    ch1[j+1] = temp;
                }
            }
        }

        for(int i = 0; i < ch2.length; i++){
            for(int j = 0; j < ch2.length - i - 1; j++){
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

        return true;

    }
}

class Test{
    public static void main(String args[]){
        try{
            boolean flag = Sequence.isAnagram("hello", "lleoh");
            System.out.println(flag);
        } catch(NullStringException e){
            System.out.println(e);
        }
    }
}