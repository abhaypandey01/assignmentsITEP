import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter " + (i+1) + " element: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println("Element "+ (i+1)+ " : " + arr[i]);
        }

        int low = 0, mid = 0, high = n - 1;

        while(low <= high){

            mid = low + (high - low)/2;

            if((mid == 0 || arr[mid] >= arr[mid - 1]) && (mid == arr.length - 1 || arr[mid] >= arr[mid + 1])){ 
                System.out.println("Peak element found at " + (mid + 1));
                break;
            }
            else if(arr[mid] < arr[mid + 1]) low = mid + 1;
            else high = mid -1;
        }

        if(low > high) System.out.println("No peak element found.");
    }
}