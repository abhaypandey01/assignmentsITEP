class Test{
    public static int subArrayWithmaxProduct(int a[]){
        // int arr[] = a[];
        int i = 0, j = 0;
        int maxi = 1;

        for(i = 0; i < a.length; i++){
            int prod = 1;
            for(j = i; j < a.length; j++){
                prod *= a[j];
                if(prod > maxi){
                    maxi = prod;
                }
            }
        }
        return maxi;
    }

    public static void main(String[] args){
        int arr[] = {6, -3, -10, 0, 2};
        int maxProduct = subArrayWithmaxProduct(arr);

        System.out.println("The maximum product of array/ sub-array : "+ maxProduct);
    }
}