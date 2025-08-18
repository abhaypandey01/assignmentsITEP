import java.util.ArrayList;

class Bank{
    ArrayList<Account> al = new ArrayList<Account>();

    public void AccountAdd(Account account){
        al.add(account);
    }

    public void AccountRemove(Account account){
        al.remove(account);
    }

    public void details(){
        for(Account element : al){
            // String data = element.displayFullAccountDetails();
            System.out.println(element.displayFullAccountDetails());
        }
    }
}

class Account{
    private String holderName;
    private String contact;
    private int balance;

    public Account(String holderName, String contact, int balance){
        this.holderName = holderName;
        this.contact = contact;
        this.balance = balance;
    }

    public Account(){}

    public void deposit(int ammount){
        balance = balance +ammount;
    }

    public void withdraw(int ammount){
        balance = balance - ammount;
    }

    public String displayFullAccountDetails(){
        return this.holderName+" : "+this.contact+" : "+this.balance;
    }
}

class Test{
    public static void main(String args[]){
        Account ac11 = new Account("Ballu", "019293497", 20000);
        Account ac12 = new Account("Lallu", "019293497", 200);
        Account ac13 = new Account("Kallu", "019293497", 2000);
        Account ac14 = new Account("Tillu", "019293497", 10000);
        Account ac15 = new Account("Tika", "019293497", 500);
        System.out.println("-----WELCOME SIR/MADAM-------");
        System.out.println("Name\tContact\t\tBalance");

        Bank kotak = new Bank();
        kotak.AccountAdd(ac11);
        kotak.AccountAdd(ac12);
        kotak.AccountAdd(ac13);
        kotak.AccountAdd(ac14);
        kotak.AccountAdd(ac15);
        ac14.deposit(2000);

        kotak.details();
    }
}