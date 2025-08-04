/*
Bank Account
Create a class BankAccount with fields: accountNumber, holderName, balance.
Use setters to assign values. Add a method to display balance.
*/

class Bank{
    private String holderName;
    private int accountNumber;
    private int balance;

    public void setHolderName(String holderName){
        this.holderName = holderName;
    }

    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance){
        this.balance = balance;
    }

    public void display(){
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name : "+ holderName);
        System.out.println("Balance : "+ balance);
    }

}

class Test{
    public static void main(String args[]){
        Bank obj = new Bank();
        obj.setAccountNumber(12991234);
        obj.setHolderName("Abhay");
        obj.setBalance(20000);
        obj.display();
    }
}