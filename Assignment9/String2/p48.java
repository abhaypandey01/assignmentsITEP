class Test{
    public static void main(String args[]){
        String str = "";
        int a = 1;
        byte b = 2;
        short c = 3;
        long d = 5l;
        float f= 4.5f;
        double g = 5.1;
        str = str + String.valueOf(a) + String.valueOf(b) + String.valueOf(c) + String.valueOf(d) + String.valueOf(f) + String.valueOf(g);
        System.out.println(str);
    } 
}