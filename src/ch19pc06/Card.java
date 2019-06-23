package ch19pc06;

/**
 * 
 * @author frank
 */
public class Card {
    // Enums for the value and suit of the cards
    public enum VALUE {
        ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING
    }
    
    public enum SUIT {
        SPADES, CLUBS, HEARTS, DIAMONDS
    }
    
    private VALUE value;
    private SUIT suit;
    
    // Constructor
    public Card(SUIT suit, VALUE value){
        this.suit = suit;
        this.value = value;
    }
    
    public VALUE getValue() {
        return value;
    }
    
    public SUIT getSuit() {
        return suit;
    }
    
    @Override
    public String toString(){
        return value + " OF " + suit;
    }
}
