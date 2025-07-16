import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter purchased quantity:");
        int quantity = sc.nextInt();
        int cost = 100;
        float discount = 0.05f;
        float final_price;

        if(quantity > 1000){
            final_price = (cost*quantity)*discount;
            System.out.println("Final cost to be paid is "+ final_price);
        } else {
            System.out.println("Quantity less than 1000, no discount.");
        }

    }
}