package SortingCards;

public class Main {
    public static void main(String[] args) {
        /*
        Card first = new Card(2, Card.SPADES);
        System.out.println(first);

         */

        Hand hand = new Hand();
        hand.addCards( new Card(2, Card.DIAMONDS) );
        hand.addCards( new Card(2, Card.SPADES) );
        hand.addCards( new Card(2, Card.HEARTS) );
        hand.addCards( new Card(2, Card.CLUBS) );

        hand.sort();
        hand.printHand();

    }
}
