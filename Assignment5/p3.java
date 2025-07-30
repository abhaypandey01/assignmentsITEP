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

        int evenSum = 0;
        int oddSum = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0)
            evenSum += arr[i];
            else
            oddSum += arr[i];
        }

        System.out.println("Sum of odd elements: "+ oddSum);
        System.out.println("Sum of even elements: "+ evenSum);
    }
}