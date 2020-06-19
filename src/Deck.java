import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {

    // ArrayList of Cards
    List<Card> cards = new ArrayList<Card>();

    // ArrayList for suits
    List<String> suits = Arrays.asList("Hearts", "Diamonds", "Clubs", "Spades");

    public Deck() {

        for (int i = 2; i <= 14; i++ ) {

            for (String suit : suits) {
                cards.add(new Card(i, suit));
            }

        }

    }

    // Randomizes the order of the cards
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // Removes and returns the top card of the Cards field
    public Card draw() {
        return cards.remove(0);
    }
}
