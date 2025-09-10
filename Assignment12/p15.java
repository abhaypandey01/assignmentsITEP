import java.util.*;

class InsufficientBalanceException extends RuntimeException{
    public InsufficientBalanceException(){
        super("Balance is insuficinet");
    }
}

class IncorrectPinForThirdTime extends RuntimeException{
    public IncorrectPinForThirdTime(){
        super("You have entered pin incorrect for third time.");
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

    public void withdraw(int amount){
        Scanner sc = new Scanner(System.in);
        int pin = 1234;
        int i = 0;
        while(i < 3){
            int l = sc.nextInt();
            if(l == pin) break;
            else {
                System.out.println("Incorrect pin.");
            }
            i++;
        }
        if(i == 3) throw new IncorrectPinForThirdTime();
        if(amount < bal) {
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
        ac.withdraw(1100);
    }

}