class Test{

    static void longestWord(String str){
        char[] ch = str.toCharArray();
        int n = ch.length, k = 0, max = 0;

        for(int i = 0; i < n; i++){
            int count = 0;
            for(int j = i; j < n; j++){
                if(ch[j] == 32) break;
                count++;
            }

            if(count > max){
                max = count;
                k = i;
            }
        }

        char[] newch = new char[max];

            for(int j = 0; j < max; j++){
                newch[j] = ch[k];
                k++;
            }

            System.out.println(newch);

    }

    public static void main(String args[]){
        String str = "aabbsdsds cddcddd eeef dmnkfir";
        longestWord(str);
    }
}