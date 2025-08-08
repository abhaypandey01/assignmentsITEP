class Test{
    public static void main(String args[]){
        int arr[] = {1,2,4,6,7,8};
        int n = arr.length;
        int temp = arr[0];

        for(int i = 0; i < n - 1; i++){
            arr[i] = arr[i+1];
        }

        arr[n-1] = temp;

        for(int element : arr){
            System.out.print(" " + element);
        }
    }
}