public class Transfer2{
    public static void main(String[] args){
        Accounts a = new Accounts("A", 1000);
        Accounts b = new Accounts("B", 0);
        Accounts c = new Accounts("C", 0);

        send(a, b, 50);
        send(b, c, 25);

        System.out.println(a.toString()+b.toString()+c.toString());
    }

    public static void send(Accounts from, Accounts to, double amount){
        if(from.balance()>=amount){
            from.withdraw(amount);
            to.deposit(amount);
        }else{
            System.out.println("Ooops, Not enough money in account");
        }
    }
}