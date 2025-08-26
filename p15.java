class MathOperation{
    public int multiply(int x, int y){
        return x*y;
    }

    public float multiply(float p, float q, float r){
        return p*q*r;
    }

    public int multiply(int a[]){
        int multiply = 1;
        for(int i : a) multiply *= i;
        return multiply;
    }

    public float multiply(float p, int x, int y){
        return p*x*y;
    }
}

class Test{
    public static void main(String args[]){
        MathOperation mo = new MathOperation();
        int arr[] = {1,2,3,4,5};
        int mul = mo.multiply(arr);
        System.out.println(mul);
    }
}