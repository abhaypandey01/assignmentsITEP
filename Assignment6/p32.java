class Test{
    public static void main(String args[]){
        int a[] = {1,2,3,4,5};
        int b[] = {2,4,5,6,7,8};
        int c[] = new int[a.length + b.length];

        for(int element : a) System.out.print(" " + element);
        System.out.println();

        for(int element : b) System.out.print(" " + element);
        System.out.println();

        int index = 0;

        for(int i = 0; i < a.length; i ++){
            if(a[i] % 2 == 0){
                c[index] = a[i];
                index++;
            }
        }

        for(int i = 0; i < b.length; i ++){
            if(b[i] % 2 == 0){
                c[index] = b[i];
                index++;
            }
        }

        for(int i = a.length - 1; i >= 0; i-- ){
            if(a[i] % 2 != 0){
                c[index] = a[i];
                index++;
            }
        }

        for(int i = b.length - 1; i >= 0; i-- ){
            if(b[i] % 2 != 0){
                c[index] = b[i];
                index++;
            }
        }

        for(int element : c){
            System.out.print(" " + element);
        }

    }
}