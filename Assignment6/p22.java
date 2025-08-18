import java.util.Scanner;
/*
{1,2,3,4} 
*/
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements for array 1 (in ascending order) : ");

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        for(int element : arr){
            System.out.print(" " + element);
        }

        System.out.println();

        System.out.println("Enter number : ");
        int num = sc.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        int i = 0, j = n-1;
        while(i < j){
            if(arr[i] < num){
                i++;
                if(arr[i] < min){ 
                    min = arr[i];
                }
            }
            if(arr[j] > num){
                j--;
                if(arr[j] > max){
                    max = arr[j];
                }
            }
            if(arr[i] == num){
                if( i == 0) min = -1;
                else min = arr[i - 1];
                max = arr[i+1];
                break;
            }
            if(arr[j] == num){
                if( j == n-1) max = -1;
                else max = arr[j+1];
                min = arr[j-1];
                break;
            }
        }

        System.out.println("Element lesser than " + num + " is " + min);
        System.out.println("Element greater than " + num + " is " + max);

    }
}