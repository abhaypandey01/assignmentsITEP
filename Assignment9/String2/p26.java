class Sequence{
    public static int wordCount(String str){
        String strArray[] = str.split(" ");
        if(str == null || str.isEmpty() || strArray.length == 0) return 0;
        int count  = 0;

        for(int i = 0; i < strArray.length; i++){
            count++;
        }

        return count;

        }
}

class Test{
    public static void main(String args[]){
        int count = Sequence.wordCount("hello world, java is wonderful language.");
        System.out.println(count);
    }
}