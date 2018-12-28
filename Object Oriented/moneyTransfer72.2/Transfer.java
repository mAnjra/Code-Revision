public class Transfer{
    public static void main(String[] args){
        Accounts matt = new Accounts("Matt's Account", 1000);
        Accounts myAcc = new Accounts("My Account", 0);

        matt.withdraw(100.0);
        myAcc.deposit(100.0);
        System.out.println( matt.toString()+" "+myAcc.toString());

    }
}