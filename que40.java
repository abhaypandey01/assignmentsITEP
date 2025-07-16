import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price and sell price: ");
        int costPrice = sc.nextInt();
        int sellPrice = sc.nextInt();
        if(costPrice > sellPrice){
            int loss = costPrice - sellPrice;
            System.out.println("Loss of "+ loss);
        } else {
            int profit = sellPrice - costPrice;
            System.out.println("Loss of "+ profit);
        }
    }
}