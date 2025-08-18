class Test{
    public static void main(String args[]){
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;

        for(int element : arr){
            System.out.print(" " + element);
        }

        System.out.println("\nAfter Swapping first and last digit of array :");

        int temp = arr[0];
        arr[0] = arr[n-1];
        arr[n-1] = temp;

        for(int element : arr){
            System.out.print(" " + element);
        }
    }
}