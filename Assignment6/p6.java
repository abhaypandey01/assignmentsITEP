import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;

        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter " + (i+1) + " element: ");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println("Element "+ (i+1)+ " : " + arr[i]);
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0) cnt0 += 1;
            if(arr[i] == 1) cnt1 += 1;
            if(arr[i] == 2) cnt2 += 1;
        }

        int j;
        for(j = 0; j < cnt0; j++) arr[j] = 0;
        for(j = cnt0; j < cnt1; j++) arr[j] = 1;
        for(j = cnt1; j < cnt2; j++) arr[j] = 2;

        System.out.println("After sorting the array will be");
        for(int i = 0; i < n-1; i++){
            System.out.print(arr[i] + ", ");
        }
    }
}