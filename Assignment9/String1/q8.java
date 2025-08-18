class Test{

    static void countOccurance(String str){
        char[] ch = str.toCharArray();
        boolean[] flag = new boolean[ch.length];

        for(int i = 0; i < ch.length; i++){
            int cnt = 0;
            if(flag[i]){
                continue;
            }
            for(int j = 0; j < ch.length; j++ ){
                if(ch[i] == ch[j]){
                    cnt++;
                    flag[j] = true;
                }
            }

            System.out.println(ch[i] + " : " + cnt + " times.");
        }
    }

    public static void main(String args[]){
        String str = "aabbccdddeeeef";
        countOccurance(str);
    }
}