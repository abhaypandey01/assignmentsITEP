import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int pos[] = new int[n];
        int neg[] = new int[n];
        int j = 0, k = 0;

        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter " + (i+1) + " element: ");
            arr[i] = sc.nextInt();
        }

        for(int element : arr){
            System.out.print(" " + element);
        }

        System.out.println();

        for(int i = 0; i < n; i++){
            if(arr[i] > 0) pos[j++] = arr[i];
            else neg[k++] = arr[i];
        }

        int start = 0;

        for(int i = 0; i < j; j++){
            arr[start] = pos[i];
            start++;
        }

        for(int i = 0; i < k; j++){
            arr[start] = neg[i];
            start++;
        }

        for(int element : arr){
            System.out.print(" " + element);
        }
    }
}