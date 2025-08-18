class Test{

    static int sumOfString(String str){
        String strArray[] = str.split(",\\s*");
        int sum = 0;

        for(String part : strArray){
            sum += Integer.parseInt(part);
        }
        
        return sum;
    }

    public static void main(String args[]){
        String str = "12, 23, 45, 56";

        int sum = sumOfString(str);

        System.out.println("Sum of string of integers is " + sum);
    }
}