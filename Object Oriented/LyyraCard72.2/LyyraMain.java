public class LyyraMain{
    public static void main(String[] args){
        LyyraCard card1 = new LyyraCard(20);
        System.out.println(card1);

        card1.payEconomical();
        System.out.println(card1);

        card1.payGourmet();
        card1.payEconomical();
        System.out.println(card1);
        
        card1.loadMoney(15);
        System.out.println(card1);
        card1.loadMoney(10);
        System.out.println(card1);
        card1.loadMoney(200);
        System.out.println(card1);
        
        card1.loadMoney(-15);
        System.out.println(card1);
        
    }
}
