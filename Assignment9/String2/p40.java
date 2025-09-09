class Sequence{
    public void countUppercaseLowerCase(String str){
        int cnt1 = 0, cnt2 = 0;
        for(char ch : str.toCharArray()){
            if(ch >= 'a' && ch <= 'z') cnt2++;
            if(ch >= 'A' && ch <= 'Z') cnt1++;
        }
        System.out.println("Total Uppercase Letters = "+ cnt1);
        System.out.println("Total Lowercase Letters = "+ cnt2);
    }
}

class Test{
    public static void main(String args[]){
        Sequence seq = new Sequence();
        seq.countUppercaseLowerCase("Hello World Java");
    }
}