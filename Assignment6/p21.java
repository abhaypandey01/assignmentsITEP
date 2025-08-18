class Test{
    public static void main(String args[])
    {
        int[] arr={8,3,1,2};
        int maxsum=0;
        for(int j=0;j<arr.length-1;j++)
        {
            int max=0;
        for(int i=0;i<arr.length;i++)
        {
            int tep=arr[i];
            arr[i]=arr[arr.length-1];
            arr[arr.length-1]=tep;
        }
        for(int i=0;i<arr.length;i++)
        {
            max=max+(i*arr[i]);
        }
        if(max>maxsum)
        {
            maxsum=max;
        }

        }

        System.out.println(maxsum);
        
        

    }
}