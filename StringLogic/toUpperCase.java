class Test{

    static String getLowerCase(String str){
        char[] ch = str.toCharArray();
        
        for(int i = 0; i < ch.length; i++){
            if(ch[i] >= 65 && ch[i] <= 97) ch[i] = (char)(ch[i] + 32);
        }

        String newStr = new String(ch);

        return newStr;
    }

    public static void main(String aegs[]){
        String str = "Abc";
        String n = getUpperCase(str);
        System.out.println(n);
    }
}