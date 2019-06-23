package ch19pc06;

import java.util.*;

/**
 * 
 * @author frank
 */
public class CardPlayer {
    private List<Card> hand;
    
    public CardPlayer() {
        this.hand = new ArrayList<Card>();
    }
    
    public void getCard(Card card) {
        hand.add(card);
    }
    
    public void showCards() {
        System.out.println(hand);
    }
}