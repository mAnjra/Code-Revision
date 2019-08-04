package PromissoryNote;

public class Main {
    public static void main(String[] args) {
        PromissoryNote pn = new PromissoryNote();
        pn.setLoan("Arto", 51.5);
        pn.setLoan("Arto", 10.);
        pn.setLoan("frej", 45.98);

        System.out.println(pn.howMuchIsTheDebt("Arto"));
        pn.printAllDebts();
    }
}
