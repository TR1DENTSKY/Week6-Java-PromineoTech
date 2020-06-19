import java.util.ArrayList;
import java.util.List;

public class Player {

        // ArrayList of cards called hand
        private List<Card> hand = new ArrayList<Card>();

        private int score;
        private String name;

        public Player() {
            score = 0;
        }

        public Player(String newName) {
            name = newName;
            score = 0;
        }

        // Print out info of player and calls describe method for each card in Hand List
        public void describe() {
            System.out.println("Player " + name + "'s cards are: ");
            for (Card card : hand) {
                card.describe();
            }
        }
        // Removes and returns the top card of the Hand
        public Card flip() {
            return hand.remove(0);
        }
        // Adding the returned Card to the hand field
        public void draw(Deck deck) {
            hand.add(deck.draw());
        }
        // Adds 1 to the Player’s score field
        public void incrementScore() {
            score++;
        }

        public int getScore() {
            return score;
        }

    }
