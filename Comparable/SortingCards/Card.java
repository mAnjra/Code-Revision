package SortingCards;

public class Card {

    public static final int SPADES = 0;
    public static final int DIAMONDS = 1;
    public static final int HEARTS = 2;
    public static final int CLUBS = 3;

    public static final String[] SUITS = {"Spades","Diamonds","Hearts","Clubs"}; // to help with toString printing
    public static final String[] NUMBER  = {"-", "-", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private int number;
    private int suit;

    public Card(int number, int suit){
        this.suit = suit;
        this.number = number;
    }

    @Override
    public String toString() {
        return NUMBER[this.number]+ " of "+ SUITS[this.suit];
    }
}
