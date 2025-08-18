class Test{
    public static int subArrayWithConsicutiveTerms(int a[]){
        // int arr[] = a[];
        int i = 0, j = 0;
        int maxi = 1;

        for(i = 0; i < a.length; i++){
            // int prod = 1;
            for(j = 0; j < a.length; j++){
                if(a[j] == (a[i]+1)){
                    maxi++;
                }
            }
        }
        return maxi;
    }

    public static void main(String[] args){
        int arr[] = {2,6,1,9,4,5,3};
        int maxConsecutive = subArrayWithConsicutiveTerms(arr);

        System.out.println("The maximum consecutive array/sub-array : "+ maxConsecutive);
    }
}