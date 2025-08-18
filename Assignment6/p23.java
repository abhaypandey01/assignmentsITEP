class Test{
    public static void main(String args[]){
        int arr[] = {2,3,5,7,3,2};
        int n = arr.length; 
        float sum = 0.0f;

        for(int element : arr){
            sum += element;
            System.out.print(" " + element);
        }

        float average = sum/n;

        System.out.printf("\nThe sum of array is %.0f and average is %.2f", sum, average );
    }
}