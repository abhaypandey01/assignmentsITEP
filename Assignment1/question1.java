class Main {
    public static void main(String args[]){
        // int length, breadth, area, parameter;
        // length = 70;
        // parameter = 230;
        // breadth = parameter/2 - length;
        // area = length * breadth;
        // System.out.println("Breadth ="+breadth+"cm");
        // System.out.println("Area ="+area+"cm2");

        int[] arr = {7,1,5,3,6,4};
        int max=0;
        int maxindex=0, smaxindex=0,minindex=0;

        int smax=0;
        int min=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
                minindex=i;
            }
            if(arr[i]>max)
            {
                smax=max;
                smaxindex=maxindex;
                max=arr[i];
                maxindex=i;
            }
            else if(arr[i]>smax && arr[i]<max)
            {
                smax=arr[i];
                smaxindex=i;
            }
        }

        // System.out.print(max);
        // System.out.print(smax);

        if(minindex<maxindex)
        {
            System.out.print(arr[maxindex]-arr[minindex]);
        }
        else if(minindex<smaxindex)
        {
            System.out.print(arr[smaxindex]-arr[minindex]);

        }
        else{
            System.out.print(0);
        }

    }
}
