class Test{

    public static void main(String args[]){
        int a[] = {10,5,4,3,2,1};
        int b[] = {11,6,5,4};
        int c[] = new int[(a.length + b.length)];

        System.out.println("\nAfter joining both arrays in descending order : ");

        int index = 0, left =0, right = 0;
        while(index < c.length && left < a.length && right < b.length){
            if(a[left] > b[right]){
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