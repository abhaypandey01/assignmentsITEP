class Sequence{
    public static int sumDigits(String str){
        char ch[] = str.toCharArray();
        int sum = 0;
        if(str == null || str.isEmpty()) return 0;
        for(int i = 0; i < ch.length; i++){
            if(ch[i] == '1' || ch[i] == '2' || ch[i] == '3' || ch[i] == '4' || ch[i] == '5' || ch[i] == '6' || ch[i] == '7' || ch[i] == '8' || ch[i] == '9' || ch[i] == '0'){
                sum += Character.getNumericValue(ch[i]);
            }
        }

        return sum;
    }
}

class Test{
    public static void main(String args[]){
        int sum = Sequence.sumDigits("1hello5");
        System.out.println(sum);
    }
}