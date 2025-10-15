class Test{
    public static void var1(double d, int... arr){
        for(int i : arr){
            System.out.println(i);
        }
        System.out.println(d);
    }
}

class Test1{
    public static void main(String args[]){
        Test.var1(12.0, 12);
    }
}