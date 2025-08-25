class Sequence{
    public static void removeDuplicates(int arr[]){
        boolean flag = false;
        int n = arr.length, k = 0;
        int temp = arr[0]; 
        for(int i = 0; i < arr.length; i++){
            flag = true;
            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]) flag = false;
            }
            if(flag){
                arr[k] = arr[i];
                k++;
            }
        }

        for(int i = 0; i < k; i++){
            System.out.print(" " + arr[i]);
        }

    }
}

class Test{
    public static void main(String args[]){
        int arr[] = {1,2,2,3,3,4,4,4,5,4,3};
        Sequence.removeDuplicates(arr);
    }
}