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

        for(int i = 0; i < n; i++){
            boolean flag = true;
            for(int j = 0; j < n; j++){
                if(i != j && arr[i] == arr[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println("The unique element is " + arr[i]);
            }
        }

    }
}