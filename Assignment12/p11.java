import java.util.*;

class InsufficientBalanceException extends RuntimeException{
    public InsufficientBalanceException(){
        super("Balance is insufficient.");
    }
}

class Account{
    private int bal;

    public Account(int bal){
        this.bal = bal;
    }

    public int getBalance(){
        return bal;
    }

    public void withdraw(int amount) throws InsufficientBalanceException{
        if(amount <= bal) {
            this.bal = bal - amount;
            System.out.println("Updated balance after withdrawal : "+ this.bal);
        } else {
            throw new InsufficientBalanceException();
        }
    }
}

class Test{

    public static void main(String args[]){
        Account ac = new Account(1200);
        try{
            ac.withdraw(1300);
        } catch (InsufficientBalanceException e){
            System.out.println(e);
        }
    }

}