class Test{

    static int getLength(String str){
        char[] ch = str.toCharArray();
        int cnt = 0;
        for(char c : ch) cnt++;

        return cnt;
    }

    public static void main(String aegs[]){
        String str = "Abc";
        int n = getLength(str);
        System.out.println(n);
    }
}