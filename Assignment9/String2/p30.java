class Sequence{
    private String str;

    public Sequence(){}

    public Sequence(String str){
        this.str = str;
    }

    public boolean containsWord(String str2){
        if(str == null || str.isEmpty()) return false;
        String strArray[] = str.split(" ");
        for(int i = 0; i < strArray.length; i++){
            if(strArray[i].equals(str2)) return true;
        }

        return false;
    }
}

class Test{
    public static void main(String args[]){
        Sequence seq = new Sequence();
        boolean result = seq.containsWord("hello");
        System.out.println(result);
    }
}