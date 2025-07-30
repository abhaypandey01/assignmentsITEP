import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,3,4,5,6};
        int n = arr.length;

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nEnter element you want to search index of : ");
        int element = sc.nextInt(), low = 0, high = n -1;
        boolean flag = false;

        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == element){
                System.out.println("Element found at index " + (mid + 1));
                flag = true;
                break;
            } else if(arr[mid] > element){
                high -= 1;
            } else {
                low += 1;
            }
        }
        if(!flag){
            System.out.println("Elelment not found.");
        }
    }
}