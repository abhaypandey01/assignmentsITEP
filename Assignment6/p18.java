class Test{

    public static int maxSum(int a[]){
        int i = 0, j = 0;
        int max = 0;

        for(i = 0; i < a.length; i++){
            int sum = 0;

            for(j = i; j < a.length; j++){
                sum += a[j];
                if(sum > max){
                max = sum;
            }
            }

        }
        return max;
    }

    public static void main(String... args){
        int arr[] = {1,2,3,-2,5};
        int maxi = maxSum(arr);
        System.out.println("The maximum sum of given array is " + maxi);
    }
}