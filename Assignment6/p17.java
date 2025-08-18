class Test{
    public static void main(String... args){
        int arr[] = {1,3,-2,0,-1,3};
        int i = 0, j = 0;
        int sum = 0;

        for(i = 0; i < arr.length; i++){
            sum = 0;

            for(j = i; j < arr.length; j++){
                sum += arr[j];
                if(sum == 0){
                System.out.println("Starting index : " + i + " Ending index : " + j);
            }
            }

        }
    }
}