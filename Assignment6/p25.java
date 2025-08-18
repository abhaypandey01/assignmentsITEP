class Test{
    public static void main(String args[]){
        int arr[] = { 1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int start = 0, end = n-1;

        for(int element : arr) System.out.print(" " + element);

        System.out.println("\nAfter Reversing the array will be : ");

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for(int element : arr) System.out.print(" " + element);
    }
}