class Test{
    public static void main(String args[]){
        int[] arr = {1,-2,-3,-5,2, 4, 5, 6};
        int[] pos = new int[arr.length];
        int[] neg = new int[arr.length];
        int n = arr.length;
        int posLength = 0, negLength = 0;

        for(int i = 0; i < n; i++){
            if(arr[i] > 0) pos[posLength++] = arr[i];
            else neg[negLength++] = arr[i];
        }

        int i = 0, j = 0, k =0;

        while(i < n && j < posLength && k < negLength){
            if(i % 2 == 0) {
                arr[i] = pos[j];
                i++;
                j++;
            }
            else {
                arr[i] = neg[k];
                i++;
                k++;
            }
        }

        while(j < posLength){
            arr[i] = pos[j];
            j++;
            i++;
        }

        while(k < negLength){
            arr[i] = neg[k];
            k++;
            i++;
        }

        for(int element : arr){
            System.out.print(" " + element);
        }
    }
}