class Test{
    public static void main(String args[]){
        //  an = a1 + (n-1)d
        //sn = n/2[2a+(n-1)d]
        // -21, -18, -15, -12;
        // float n=28.0f, an;
        // int a = -21, d  = 3;
        // an = (float)(a + (n-1)*d);
        // System.out.printf("The 28th term will be %.0f",an);

        float n=28.0f, sn;
        int a = -21, d = 3;
        sn = (float)(n/2*(2*a + (n-1)* d));
        System.out.printf("The sum upto 28th term will be %.0f",sn);
    }
}