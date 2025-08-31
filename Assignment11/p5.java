/**
 * Subclasses:

SavingsAccount (cannot withdraw below ₹1000)

CurrentAccount (no min balance required)

Interface LoanEligible with method checkLoanEligibility().

Only SavingsAccount is loan eligible.
 */

interface LoanEligible{
    void checkLoanEligibility();
}

abstract class BankAccount{
    private double acc;
    private double balance;

    public BankAccount(){}

    public BankAccount(double acc, double balance){
        this.acc = acc;
        this.balance = balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getAccount(){
        return this.acc;
    }

    public double getBalance(){
        return this.balance;
    }

    abstract public void deposit(double amount);

    abstract public void withdraw(double amount);

    public void showBalance(){
        System.out.println("-----------------------------------------------");
        System.out.println("For account " + this.acc + " available balance is " + this.balance);
        System.out.println("-----------------------------------------------");
    }

}

class Savings extends BankAccount implements LoanEligible{
    public Savings(){}

    public Savings(double acc, double balance){
        super(acc, balance);
    }

    public void deposit(double amount){
        setBalance(getBalance() + amount);
            System.out.println(getAccount() + " Updated Balance After Deposit:-\nAvail. Balance: " + getBalance());
    }

    public void withdraw(double amount){
        if(getBalance() < 1000 || amount > getBalance()) System.out.println("Unable to withdraw.");
        else {
            setBalance(getBalance() - amount);
            System.out.println(getAccount() + " Updated Balance After Withdraw:-\nAvail. Balance: " + getBalance());
        }
    }

    public void checkLoanEligibility(){
        System.out.println("Acc. No. " + getAccount() + " eligible for the loan.");
    }

}

class Current extends BankAccount implements LoanEligible{
    public Current(){}

    public Current(double acc, double balance){
        super(acc, balance);
    }

    public void deposit(double amount){
        setBalance(getBalance() + amount);
        System.out.println(getAccount() + " updated balance after deposit:\nAvail. Balance: " + getBalance());
    }

    public void withdraw(double amount){
        if(amount > getBalance()) System.out.println("Unable to withdraw");
        else {
            setBalance(getBalance() - amount);
            System.out.println(getAccount() + " updated balance after withdraw:\nAvail. Balance: " + getBalance());
        }
    }

    public void checkLoanEligibility(){
        System.out.println("Sorry, you are not eligible for the loan.");
    }
}

class Test{
    public static void main(String args[]){
        Savings sv1 = new Savings(100450, 34000.0);
        BankAccount sv1_account = sv1;
        LoanEligible sv1_loan = sv1;

        sv1_account.deposit(1200);
        sv1_account.showBalance();
        sv1_account.withdraw(30000);
        sv1_loan.checkLoanEligibility();
        sv1_account.showBalance();

        Current cr1 = new Current(123445, 20000);
        BankAccount cr1_account = cr1;
        LoanEligible cr1_loan = sv1;

        cr1_account.deposit(1000);
        cr1_account.showBalance();
        cr1_account.withdraw(2000);
        cr1_loan.checkLoanEligibility();
        cr1_account.showBalance();

    }
}