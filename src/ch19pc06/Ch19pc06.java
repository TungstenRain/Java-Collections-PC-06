package ch19pc06;

/**
 * 
 * @author frank
 */
public class Ch19pc06 {

    /**
     * The Main Method
     * @param args String[] The command line arguments
     */
    public static void main(String[] args) {
        // Instantiate Deck
        Deck deck = new Deck();
        
        // Shuffle the Deck
        deck.shuffle();
        
        // Instantiate a player
        CardPlayer player = new CardPlayer();
        
        // Deal 5 cards to the player
        for (int i = 0; i < 5; i++) {
            Card card = deck.deal();
            player.getCard(card);
        }
        
        // Display the hand
        player.showCards();
    }
}
