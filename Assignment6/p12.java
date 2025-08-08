class Test{
    public static void  main(String args[]){
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {5};
        int arr3[] = {2,3,5};
        int l = 0, m = 0, n = 0;

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

        while(l < arr1.length && m < arr2.length && n < arr3.length){
            if((arr1[l] == arr2[m]) && (arr2[m] == arr3[n]) && (arr1[l] == arr3[n]))
                System.out.println("The repeating element is " + arr1[l]);
            l++;
            m++;
            n++;
        }
    }
}