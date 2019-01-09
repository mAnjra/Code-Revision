public class LyyraCard{
    private double balance;
    
    public LyyraCard(double balance){
        this.balance = balance;
    }

    public void payEconomical() {
        if(balance >= 2.50){
        this.balance -= 2.50;
        }else{
            System.out.println("Not enough credit");
        }
    }

    public void payGourmet() {
        if (balance >= 4.0) {
            this.balance -= 4.00;
        }else{
            System.out.println("Not enough credit");
        }
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
