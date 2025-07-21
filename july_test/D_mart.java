import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name please: ");
        String name = sc.next();

        System.out.println("Enter quantity of Item 1: ");
        int quantity1 = sc.nextInt();

        System.out.println("Enter quantity of Item 2: ");
        int quantity2 = sc.nextInt();

        System.out.println("Enter quantity of Item 3: ");
        int quantity3 = sc.nextInt();

        System.out.println("Enter quantity of Item 4: ");
        int quantity4 = sc.nextInt();

        System.out.println("Enter quantity of Item 5: ");
        int quantity5 = sc.nextInt();

        System.out.println("Enter quantity of Item 6: ");
        int quantity6 = sc.nextInt();

        System.out.println("Enter quantity of Item 7: ");
        int quantity7 = sc.nextInt();

        System.out.println("Enter quantity of Item 8: ");
        int quantity8 = sc.nextInt();

        System.out.println("Enter quantity of Item 9: ");
        int quantity9 = sc.nextInt();

        System.out.println("Enter quantity of Item 10: ");
        int quantity10 = sc.nextInt();

        int price_item1 = 10, price_item2 = 10 * 2, price_item3 = 10 * 3, price_item4 = 10 * 4, price_item5 = 10 * 5, price_item6 = 10 * 6, price_item7 = 10 * 7, price_item8 = 10 * 8, price_item9 = 10 * 9, price_item10 = 10 * 10;

        int total_price_item1 = price_item1 * quantity1; 
        int total_price_item2 = price_item2 * quantity2;
        int total_price_item3 = price_item3 * quantity3;
        int total_price_item4 = price_item4 * quantity4;
        int total_price_item5 = price_item5 * quantity5;
        int total_price_item6 = price_item6 * quantity6;
        int total_price_item7 = price_item7 * quantity7;
        int total_price_item8 = price_item8 * quantity8;
        int total_price_item9 = price_item9 * quantity9;
        int total_price_item10 = price_item10 * quantity10;
        
        int total_bill = total_price_item1 + total_price_item2 + total_price_item3 + total_price_item4 + total_price_item5 + total_price_item6 + total_price_item7 + total_price_item8 + total_price_item9 + total_price_item10;

        double gst = 0.1, discount_more_4 = 0.05, discount_10 = 0.15, discount_5 = 0.1, discount_10000 = 0.15, discount_5000 = 0.1;

        double total_bill_gst = total_bill + (total_bill * gst);

        double discounted_bill = 0, discounted_item_total = 0 , discounted_item1 = 0, discounted_item2 = 0, discounted_item3 = 0, discounted_item4 = 0, discounted_item5 = 0, discounted_item6 = 0, discounted_item7 = 0, discounted_item8 = 0, discounted_item9 = 0, discounted_item10 = 0, after_gst = 0;

        if(quantity1 > 4) discounted_item1 = total_price_item1 - (total_price_item1 * discount_more_4);
        else discounted_item1 = total_price_item1;

        if(quantity2 > 4) discounted_item2 = total_price_item2 - (total_price_item2 * discount_more_4);
        else discounted_item2 = total_price_item2;

        if(quantity3 > 4) discounted_item3 = total_price_item3 - (total_price_item3 * discount_more_4);
        else discounted_item3 = total_price_item3;

        if(quantity4 > 4) discounted_item4 = total_price_item4 - (total_price_item4 * discount_more_4);
        else discounted_item4 = total_price_item4;

        if(quantity5 > 4) discounted_item5 = total_price_item5 - (total_price_item5 * discount_more_4);
        else discounted_item5 = total_price_item5;

        if(quantity6 > 4) discounted_item6 = total_price_item6 - (total_price_item6 * discount_more_4);
        else discounted_item6 = total_price_item6;

        if(quantity7 > 4) discounted_item7 = total_price_item7 - (total_price_item7 * discount_more_4);
        else discounted_item7 = total_price_item7;

        if(quantity8 > 4) discounted_item8 = total_price_item8 - (total_price_item8 * discount_more_4);
        else discounted_item8 = total_price_item8;

        if(quantity9 > 4) discounted_item9 = total_price_item9 - (total_price_item9 * discount_more_4);
        else discounted_item9 = total_price_item9;

        if(quantity10 > 4) discounted_item10 = total_price_item10 - (total_price_item10 * discount_more_4);
        else discounted_item10 = total_price_item10;


        if(quantity1 == 5) discounted_item1 = total_price_item1 - (total_price_item1 * discount_5);
        if(quantity2 == 5) discounted_item2 = total_price_item2 - (total_price_item2 * discount_5);
        if(quantity3 == 5) discounted_item3 = total_price_item3 - (total_price_item3 * discount_5);
        if(quantity4 == 5) discounted_item4 = total_price_item4 - (total_price_item4 * discount_5);
        if(quantity5 == 5) discounted_item5 = total_price_item5 - (total_price_item5 * discount_5);
        if(quantity6 == 5) discounted_item6 = total_price_item6 - (total_price_item6 * discount_5);
        if(quantity7 == 5) discounted_item7 = total_price_item7 - (total_price_item7 * discount_5);
        if(quantity8 == 5) discounted_item8 = total_price_item8 - (total_price_item8 * discount_5);
        if(quantity9 == 5) discounted_item9 = total_price_item9 - (total_price_item9 * discount_5);
        if(quantity10 == 5) discounted_item10 = total_price_item10 - (total_price_item10 * discount_5);

        if(quantity1 == 10) discounted_item1 = total_price_item1 - (total_price_item1 * discount_10);
        if(quantity2 == 10) discounted_item2 = total_price_item2 - (total_price_item2 * discount_10);
        if(quantity3 == 10) discounted_item3 = total_price_item3 - (total_price_item3 * discount_10);
        if(quantity4 == 10) discounted_item4 = total_price_item4 - (total_price_item4 * discount_10);
        if(quantity5 == 10) discounted_item5 = total_price_item5 - (total_price_item5 * discount_10);
        if(quantity6 == 10) discounted_item6 = total_price_item6 - (total_price_item6 * discount_10);
        if(quantity7 == 10) discounted_item7 = total_price_item7 - (total_price_item7 * discount_10);
        if(quantity8 == 10) discounted_item8 = total_price_item8 - (total_price_item8 * discount_10);
        if(quantity9 == 10) discounted_item9 = total_price_item9 - (total_price_item9 * discount_10);
        if(quantity10 == 10) discounted_item10 = total_price_item10 - (total_price_item10 * discount_10);

        discounted_item_total = discounted_item1 + discounted_item2 + discounted_item3 + discounted_item4 + discounted_item5 + discounted_item6 + discounted_item7 + discounted_item8 + discounted_item9 + discounted_item10;

        double bill_with_gst_carrybag = 0;
        double discounted_bill_with_gst_carrybag = 0;
        
        System.out.println("Do you want a carrybag ? (y/n)");
        char carrybag = sc.next().charAt(0);

        System.out.println("What is your gender ? (f/m)");
        char gender = sc.next().charAt(0);

        if(total_bill >= 5000 && total_bill < 10000){
            discounted_bill = discounted_bill - (discounted_bill * discount_5000);
        } else if (total_bill >= 10000){
            discounted_bill = discounted_bill - (discounted_bill * discount_10000);
        }

        double gst_price = total_bill * gst;

        if(carrybag == 'y'){
            bill_with_gst_carrybag = total_bill + 10 + gst_price;
            discounted_bill_with_gst_carrybag = discounted_item_total + 10 + gst_price;
        }

        System.out.println("\t \t D-mart\n");
        System.out.println("Name : "+name+" \t\tDate : 21/7/2025\n");
        System.out.println("------------------------------------------------------------------------\n");
        System.out.println("Item Name\tQuantity\tPrice\tTotal\tAfter-Discount");
        System.out.println("Item-1\t\t"+quantity1+"\t\t"+price_item1+"\t"+total_price_item1+"\t"+discounted_item1);
        System.out.println("Item-2\t\t"+quantity2+"\t\t"+price_item2+"\t"+total_price_item2+"\t"+discounted_item2);
        System.out.println("Item-3\t\t"+quantity3+"\t\t"+price_item3+"\t"+total_price_item3+"\t"+discounted_item3);
        System.out.println("Item-4\t\t"+quantity4+"\t\t"+price_item4+"\t"+total_price_item4+"\t"+discounted_item4);
        System.out.println("Item-5\t\t"+quantity5+"\t\t"+price_item5+"\t"+total_price_item5+"\t"+discounted_item5);
        System.out.println("Item-6\t\t"+quantity6+"\t\t"+price_item6+"\t"+total_price_item6+"\t"+discounted_item6);
        System.out.println("Item-7\t\t"+quantity7+"\t\t"+price_item7+"\t"+total_price_item7+"\t"+discounted_item7);
        System.out.println("Item-8\t\t"+quantity8+"\t\t"+price_item8+"\t"+total_price_item8+"\t"+discounted_item8);
        System.out.println("Item-9\t\t"+quantity9+"\t\t"+price_item9+"\t"+total_price_item9+"\t"+discounted_item9);
        System.out.println("Item-10\t\t"+quantity10+"\t\t"+price_item10+"\t"+total_price_item10+"\t"+discounted_item10);


        System.out.println("------------------------------------------------------------------------\n");
        System.out.println("\t\t\t\tA.P.\t\tD.P.\n");
        System.out.println("\t\t\t\t"+total_bill+"\t\t"+discounted_item_total);

        if(gender == 'f'){
            System.out.println("Gift :- Cadeberry\t\t0.00\t\t0.00\n");
        } else {
            System.out.println("Gift :- Ledger wallet\t\t0.00\t\t0.00\n");
        }

        if(carrybag == 'y'){
            System.out.println("Carry bag : yes\t\t\t10.00\t\t10.00\n");
        } else {
            System.out.println("Carry bag : no \t\t\t 0.00\t\t 0.00\n");
        }

        System.out.println("\nGST (10%)\t\t\t"+gst_price+"\t\t"+gst_price);

        System.out.println("------------------------------------------------------------------------\n");
        System.out.println("\t\t\t\t"+bill_with_gst_carrybag+"\t\t"+discounted_bill_with_gst_carrybag+"\n");
        System.out.println("\t\t\t\tThan You\n");
        System.out.println("\t\t\t\tTo vist us\n");
        System.out.println("\t\t\t\tD-Mart\n");


    }
}