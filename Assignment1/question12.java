class Main {
    public static void main(String args[]){
        /*
        h^2 = a^2 + b^2
        13^2 = 12^2 + b^2
        b^2 = 13^2 - 12^2
        b = Math.sqrt(13^2 - 12^2)
        */
        int hypotenuse = 13, side1 = 12, side2;
        side2 = (int)(Math.sqrt(Math.pow(hypotenuse,2)-Math.pow(side1,2)));
        System.out.println("Third side = "+side2);
    }
}