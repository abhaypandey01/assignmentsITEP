class Test{
    public static void main(String args[]){
        int arr[] = {1,0,0,1,0};
        int cnt = 0, n = arr.length;

        for(int element : arr) System.out.print(" "+ element);

        System.out.println();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0) arr[i] = -1;
        }

        System.out.println("Following are the sub-arrays: ");
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += arr[j];
                if(sum == 0) {
                    System.out.println(i + " : "+ j);
                    cnt++;
                }
            }
        }

        if(cnt == 0){
            System.out.println("No such sub array found");
        } else {
            System.out.println("Total sub arrays with equal 1s and 0s is " + cnt);
        }
    }
}