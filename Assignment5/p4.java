import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        boolean flag = false;

        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter " + (i+1) + " element: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to search: ");
        int element = sc.nextInt();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element){
            System.out.println("Element found at index no. "+ i);
            flag = true;
            }
        }

        if(!flag){
            System.out.println("Element not found in the array.");
        }
    }
}