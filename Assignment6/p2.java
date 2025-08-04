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

        int max = 0, min = 1000000;
        for(int i = 0; i < n; i++){
            if(max < arr[i]) max = arr[i];
            if(min > arr[i]) min = arr[i];
        }

        System.out.println("Maximum value in array is " + max + " and the minimum value is " + min);

    }
}