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

    @Override
    public String toString(){
        return "This card has "+ this.balance + " pounds";
    }
}