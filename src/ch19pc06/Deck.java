package ch19pc06;

import java.util.*;

/**
 * 
 * @author frank
 */
public class Deck {
    private final int TOTAL_CARDS = 52;
    private final List<Card> cards;
    private final DeckIterator deckIterator;
    
    // Constructor
    public Deck() {
        cards = new ArrayList<>();
        deckIterator = new DeckIterator();
        create();
    }
    
    private void create() {
        for (Card.SUIT suit : Card.SUIT.values()) {
            for (Card.VALUE value : Card.VALUE.values()) {
                cards.add(new Card(suit, value));
            }
        }
    }
    
    public void shuffle() {
        Collections.shuffle(cards);
    }
    
    public Card deal() {
        return deckIterator.next();
    }
    
    private class DeckIterator implements Iterator<Card> {
        private int index = -1;
        
        @Override
        public boolean hasNext(){
            return index < TOTAL_CARDS;
        }
        
        @Override
        public Card next() {
            if(hasNext()) {
                index++;
                return cards.get(index);
            }
            return null;
        }
    }
    
    @Override
    public String toString() {
        return cards.toString();
    }
}