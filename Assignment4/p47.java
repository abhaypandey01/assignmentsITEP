class Test{
    public static void main(String args[]){
        int a = 10, b = 15;
        while(a <= b){
            int i = 1;
            while(i <= 10){
                System.out.println(a * i);
                i++;
            }
            System.out.println("--------------");
            a++;
        }
    }
}