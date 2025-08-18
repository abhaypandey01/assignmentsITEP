class Test{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int element : arr) System.out.print(" " + element);

        System.out.println();

        for(int i = 0; i < n; i++){
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }

        System.out.println("The greatest element in array is " + max + " and smallest element is " + min);
    }
}