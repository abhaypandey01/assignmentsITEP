class Sequence{
    private String str;

    public Sequence(String str){
        this.str = str;
    }

    public boolean subStr(String str2){
        if(str2 == null || str2.length() > str.length()) return false;
        for(int i = 0; i < str.length(); i++){
            for(int j = i; j < str.length(); j++){
                String sub = "";
                for(int k = i; k <= j; k++){
                    sub += str.charAt(k);
                }
                // System.out.println(sub);
            if(sub.equals(str2)) return true;
            }
            // System.out.println(str2);
        }
        return false;
    }
}

class Test{
    public static void main(String args[]){
        Sequence seq = new Sequence("Hello");
        boolean result = seq.subStr("Hello1");

        if(result) System.out.println("Given subsequence is part of String.");
        else System.out.println("Given subsequence is not a part of String.");
    }
}