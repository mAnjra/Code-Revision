package SortingCards;

import java.util.ArrayList;
import java.util.Collections;

public class Hand implements Comparable<Hand> {
    private ArrayList<Card> hand;
    private int handTotal;

    public Hand(){
        this.hand = new ArrayList<Card>();
    }

    public void add(Card c){
        hand.add(c);
        handTotal += c.getValue();
    }

    public void print(){
        for(Card c : hand){
            System.out.println(c.toString());
        }
    }

    public void sortAgainstSuit(){
        Collections.sort(hand, new SortAgainstSuitAndValue()); // uses the compare method from the sortagainstvalueandsuit class
    }

    public void sort(){
        // uses the compare to method in the card class
        Collections.sort(hand);
    }

    @Override
    public int compareTo(Hand o) {
        return this.handTotal - o.handTotal;
    }
}
