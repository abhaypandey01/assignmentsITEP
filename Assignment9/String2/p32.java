
class Sequence{
    private String str;

    public Sequence(){}

    public Sequence(String str){
        this.str = str;
    }

    public String uniqueWordsString(){
        if(str == null || str.isEmpty()) return "";
        if(str.length() == 1) return str;

        String strArray[] = str.split(" ");
        String newstr = "";
        boolean flag[] = new boolean[strArray.length];
        int count = 0;

        for(int i = 1; i < strArray.length; i++){
            count = 0;
            if(flag[i] == true) continue;

            for(int j = i-1; j < strArray.length; j++){
                if(strArray[j].equals(strArray[i])) {
                    count++;
                    flag[j] = true;
                }
            }
            newstr = newstr + " " + strArray[i];
        }
        return newstr;
    }
}

class Test{
    public static void main(String args[]){
        Sequence seq = new Sequence("hello hello world");
        String str = seq.uniqueWordsString();
        System.out.println(str);
    }
}