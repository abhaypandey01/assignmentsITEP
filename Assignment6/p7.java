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

        for(int element : arr){
            System.out.print(" " + element);
        }

        System.out.println();

        int start = 0, sum = 12, currentSum = 0;

        for(int i = 0; i < n; i++){
            currentSum += arr[i];
            while(currentSum > sum && start < i){
                currentSum -= arr[start];
                start++;
            }
            if(sum == currentSum){
            System.out.println("Index of subarray : " + (start+1) + " " + (i+1));
            break;
            }

            if(i == n){
                System.out.println("Subarray equal to sum not found.");
            }
        }
    }
}