// bubble sort
class Test{
    public static void main(String args[]){
        int arr[] = {1,5,7,4,33,45,15};
        int n = arr.length;

        System.out.println("Before sorting the array--------");

        for(int element : arr){
            System.out.print(" " + element);
        }

        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;
            
            while(j >= 0 && key < arr[j]){
                arr[j+1] = arr[j];
                --j;
            }

            arr[j+1] = key;

        }

        System.out.println("\nAfter sorting the array--------");

        for(int element : arr){
            System.out.print(" " + element);
        }
    }
}