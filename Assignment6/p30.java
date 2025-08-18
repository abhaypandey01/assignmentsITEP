class Test{
    public static void main(String args[]){
        int a[] = {1,2,3,4};
        int b[] = {6,5,4,3,2,1};
        int c[] = new int[(a.length + b.length)];

        for(int element : a) System.out.print(" " + element);
        System.out.println();

        int start = 0, end = b.length - 1;
        while(start < end){
            int temp = b[start];
            b[start] = b[end];
            b[end] = temp;
            start++;
            end--;
        }

        for(int element : b) System.out.print(" " + element);

        System.out.println("\nAfter joining both arrays in ascending order : ");

        int index = 0, left =0, right = 0;
        while(index < c.length && left < a.length && right < b.length){
            if(a[left] < b[right]){
                c[index] = a[left];
                index++;
                left++;
            } else {
                c[index] = b[right];
                index++;
                right++;
            }
        }

        while(left < a.length){
            c[index] = a[left];
            index++;
            left++;
        }

        while(right < b.length){
            c[index] = b[right];
            index++;
            right++;
        }

        for(int element : c) System.out.print(" " + element);

    }
}