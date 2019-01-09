public class LyyraMain{
    public static void main(String[] args){
        LyyraCard card1 = new LyyraCard(20);
        System.out.println(card1);

        card1.payEconomical();
        System.out.println(card1);

        card1.payGourmet();
        card1.payEconomical();
        System.out.println(card1);
    }
}