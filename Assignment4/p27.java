class Test{
    public static void main(String args[]){
        int n = 5;
        int i = 1;
        while(i < n){
            int j = 1;
            System.out.print("*");
            while(j < i){
                System.out.print(" ");
                j++;
            }
            j = 0;
            System.out.print("#");
            while(j < i){
                System.out.print(" ");
                j++;
            }
            i++;
        }
    }
}