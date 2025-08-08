import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {2,3,4,5,6,7};
        int m = arr1.length, n = arr2.length;
        int result[] = new int[Math.min(m, n)];


        for(int element : arr1){
            System.out.print(" " + element);
        }

        System.out.println();

        for(int element : arr2){
            System.out.print(" " + element);
        }

        System.out.println();
        int i = 0,j = 0, index = 0;

        while(i < m && j < n){
            if(arr1[i] > arr2[j]) j++;
            else if(arr1[i] < arr2[j]) i++;
            else{ result[index] = arr1[i];
            index++;
            i++;
            j++;
            }
        }

        for(int element : result){
            System.out.print(" " + element);
        }

        System.out.println();

        }
    }