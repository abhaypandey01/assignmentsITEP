class Test{
    static void linearSearch(int arr[], int k){
        int n = arr.length;
        int i = 0;

        for(i = 0; i < n; i++){
            if(arr[i] == k) break;
        }

        if(i == n) System.out.println("Element Not found!");
        else System.out.println("Element Found");
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,56,6,7,8};
        int k = 9;
        linearSearch(arr, k);
    }
}