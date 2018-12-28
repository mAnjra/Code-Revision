

public class Accounts{
    //FIELD
    private String AccountName;
    private double balance;
  
    //CONSTRUCTOR
    public Accounts(String AccountName, double balance){
        this.balance = balance;
        this.AccountName = AccountName;
    }
    //METHOD
    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance-=amount;
    }

    public double balance(){
        return balance;
    }

    @Override
    public String toString(){
        return AccountName + " Balance: "+ balance;
    }
}