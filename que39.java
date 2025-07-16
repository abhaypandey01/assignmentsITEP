import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter amount in multiple of 10s:");
        int amount = sc.nextInt();
        int count500=0, count100=0, count50=0, count20=0, count10=0;

        while(amount > 10){
            if(amount>=500){
            count500 = amount/500;
            amount = amount%500;
        }
        else if(amount >=100){
            count100 = amount/100;
            amount = amount%100;
        }else if(amount >= 50){
            count50 = amount/50;
            amount = amount%50;
        }else if(amount >= 20){
            count20 = amount/20;
            amount = amount%20;
        }else if(amount >= 10){
            count10 = amount/10;
            amount = amount%10;
        } else {
            System.out.println("Amount less than 10.");
        }
        }

        System.out.printf("500notes = %d, 100notes = %d, 50notes= %d, 20notes= %d, 10notes = %d", count500, count100, count50, count20, count10);
    }
}