class Test{
    public static void  main(String args[]){
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {3};
        int arr3[] = {2,3};

        System.out.println("Array 1 : ");

        for(int element : arr1){
            System.out.print(" " + element);
        }

        System.out.println("\nArray 2 : ");

        for(int element : arr2){
            System.out.print(" " + element);
        }

        System.out.println("\nArray 3 : ");

        for(int element : arr3){
            System.out.print(" " + element);
        }

        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2.length; j++){
                for(int k = 0; k < arr3.length; k++){
                    if((arr1[i] == arr2[j]) && (arr2[j] == arr3[k]) && (arr3[k] == arr1[i]))
                    System.out.print("\nCommont element : " + arr1[i]);
                }
            }
        }
    }
}