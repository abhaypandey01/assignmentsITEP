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

        int cnt = 0, k = 6;
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++ ){
                if(arr[i] + arr[j] == k) cnt++;
            }
        }
        System.out.println("The count of pairs with sum " + k + " is " + cnt);
    }
}