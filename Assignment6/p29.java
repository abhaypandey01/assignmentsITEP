class Test{
    public static void main(String[] args){
        int arr[] = {5,6,7,8,9,10};
        int n = arr.length;
        int low = 0, high = n -1, mid = 0;
        int num = 9;

        while(low <= high){
            mid = (low + high)/2;
            if(arr[mid] == num) break;
            else if(arr[mid] > num) high = mid - 1;
            else low = mid + 1;
        }

        if(low > high){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found");
        }
    }
}