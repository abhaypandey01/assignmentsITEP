
class Sequence{
    private String str;

    public Sequence(){}

    public Sequence(String str){
        this.str = str;
    }

    public String firstNonRepeatingWord(){
        if(str == null || str.isEmpty()) return "";
        if(str.length() == 1) return str;

        String strArray[] = str.split(" ");
        if(strArray.length == 2 && !(strArray[0].equals(strArray[1]))) return strArray[0];
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
            if(count == 1) return strArray[i];
        }
        return "";
    }
}

class Test{
    public static void main(String args[]){
        Sequence seq = new Sequence("");
        String str = seq.firstNonRepeatingWord();
        System.out.println(str);
    }
}