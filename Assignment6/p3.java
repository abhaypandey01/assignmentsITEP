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

        int low = 0, high = n-1;
        
        while(low <= high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low +=1;
            high -= 1;
        }

        // for(int low = 0, high = n-1; low<=high; low++,high--){
        //     int temp = arr[low];
        //     arr[low] = arr[high];
        //     arr[high] = temp;
        // }

        System.out.println("Array after reversing : ");
        for(int i = 0; i < n; i++){
            System.out.print( arr[i] +", ");
        }
    }
}