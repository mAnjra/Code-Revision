public class LyyraCard{
    private double balance;
    
    public LyyraCard(double balance){
        this.balance = balance;
    }

    public void payEconomical(){
        this.balance -= 2.50;
    }

    public void payGourmet(){
        this.balance -= 4.00;
    }
    
    public void loadMoney(double amount){
        if (amount>0) {
            this.balance += amount;
            if (this.balance > 150) {
                this.balance = 150;
            }
        }
    }

    @Override
    public String toString(){
        return "This card has "+ this.balance + " pounds";
    }
}
