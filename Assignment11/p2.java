abstract class Payment{
    private int amount;

    public Payment(){}

    public Payment(int amount){
        this.amount = amount;
    }

    abstract public void pay();

    public int paymentDetails(){
        return amount;
    }
}

interface Refundable{
    void processRefund();
}

class DeditCardPayment extends Payment{
    private int amount;

    public DeditCardPayment(){}

    public DeditCardPayment(int amount){
        this.amount = amount;
    }

    public void pay(){
        System.out.println("Payment done through debit card.");
    }

}

class CreditCardPayment extends Payment implements Refundable{
    private int amount;

    public CreditCardPayment(){}

    public CreditCardPayment(int amount){
        this.amount = amount;
    }

    public void pay(){
        System.out.println("Payment dont through creedit card.");
    }

    public void processRefund(){
        System.out.println("Refund processing...");
    }
}

class UPIPayment extends Payment implements Refundable{
    private int amount;

    public UPIPayment(){}

    public UPIPayment(int amount){
        this.amount = amount;
    }

    public void pay(){
        System.out.println("Payment done through UPI.");
    }

    public void processRefund(){
        System.out.println("Payment refund processing...");
    }
}

class Test{
    public static void main(String args[]){
        Payment pay1 = new DeditCardPayment(1200);
        pay1.pay();

        CreditCardPayment pay2 = new CreditCardPayment(1500);
        pay2.pay();
        pay2.processRefund();
        
        UPIPayment pay3 = new UPIPayment(2000);
        pay3.pay();
        pay3.processRefund();

    }
}