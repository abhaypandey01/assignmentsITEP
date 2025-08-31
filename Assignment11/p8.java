interface DiscountApplicable{
    void applyDiscount(int disount);
}

abstract class Order{
    private String orderId;
    private int amount;
    private boolean orderStatus;

    public Order(){}

    public Order(String orderId, int amount){
        this.orderId = orderId;
        this.amount = amount;
        this.orderStatus = true;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public void setOrderStatus(boolean a){
        if(a) this.orderStatus = true;
        else this.orderStatus = false;
    }

    public boolean getOrderStatus(){
        return this.orderStatus;
    }

    public String getOrderId(){
        return this.orderId;
    }

    public int getAmount(){
        return this.amount;
    }

    abstract public void processOrder();

    abstract public void cancelOrder();

    public void orderSummary(){
        processOrder();
    }
}

class OnlineOrder extends Order implements DiscountApplicable{
    public OnlineOrder(){}

    public OnlineOrder(String orderId, int amount){
        super(orderId, amount);
    }

    public void applyDiscount(int disount){
        int amount = (int)(getAmount() - (getAmount() * (disount/100.0)));
        setAmount(amount);
    }

    public void processOrder(){
        if(getOrderStatus()){
            System.out.println("Order " + getOrderId() + " is under processing total payable amount is Rs. " + getAmount());
        }
        else {
            System.out.println("Order " + getOrderId() + " was cancelled by the customer.");
        }
    }

    public void cancelOrder(){
        setOrderStatus(false);
    }
}

class PickUpOrder extends Order{
    public PickUpOrder(){}

    public PickUpOrder(String orderId, int amount){
        super(orderId, amount);
    }

    public void processOrder(){
        if(getOrderStatus())
            System.out.println("Order " + getOrderId() + " is ready to pick up, payable amount is Rs. " + getAmount());
        else System.out.println("Order " + getOrderId() + " is cancelled by customer.");
    }

    public void cancelOrder(){
        setOrderStatus(false);
    }
}

class Test{
    public static void main(String args[]){
        OnlineOrder onl = new OnlineOrder("12ABCD000", 1299);
        Order onl_order = onl;
        DiscountApplicable onl_discount = onl;

        onl_order.processOrder();
        onl_discount.applyDiscount(10);
        onl_order.orderSummary();
        onl_order.cancelOrder();
        onl_order.orderSummary();


        PickUpOrder pick = new PickUpOrder("123NMO999", 1099);
        Order pick_order = pick;

        pick_order.processOrder();
        pick_order.cancelOrder();
        pick_order.orderSummary();
    }
}