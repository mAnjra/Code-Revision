public class Account{
    public static void main(String[] args){
        Accounts glue = new Accounts("GlueFace", 100.00);
        glue.deposit(20);
        System.out.println(glue.toString());
    }
}