// bubble sort
class Test{
    public static void main(String args[]){
        int arr[] = {1,14,65,73,42,33,45,10};
        int n = arr.length;

        System.out.println("Before sorting the array--------");

        for(int element : arr){
            System.out.print(" " + element);
        }

        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("\nAfter sorting the array--------");

        for(int element : arr){
            System.out.print(" " + element);
        }
    }
}