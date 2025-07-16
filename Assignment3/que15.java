import java.util.Scanner;

/*
Cost Price(In Rs)		Tax
    > 100000			 15%
    >50000 and <=100000	 10%
    <=50000			     5%
*/


class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price of bike:");
        int bike_price = sc.nextInt();
        float tax;

        if(bike_price > 100000){
            tax = bike_price*0.15f;
        } else if((bike_price > 50000) && (bike_price <= 100000)){
            tax = bike_price*0.10f;
        } else {
            tax = bike_price*0.05f;
        }

        System.out.println("Total road tax payable: "+ tax);
    }
}