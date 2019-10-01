package SortingCards;

import java.util.ArrayList;
import java.util.Collections;

public class Hand {
    private ArrayList<Card> hand;

    public Hand(){
        this.hand = new ArrayList<Card>();
    }

    public void addCards(Card c){
        hand.add(c);
    }

    public void printHand(){
        for(Card c : hand){
            System.out.println(c.toString());
        }
    }

    public void sort(){
        // uses the compare to method in the card class
        Collections.sort(hand);
    }
}
