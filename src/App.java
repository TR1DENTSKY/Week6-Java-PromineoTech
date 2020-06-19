import java.util.List;

public class App {

    public static void main(String[] args) {


        Card card = new Card(11,"Hearts");


        // Instantiate a Deck and 2 players
        Deck deck = new Deck();
        Player player1 = new Player("1");
        Player player2 = new Player("2");

        // Calling shuffle method on the deck
        deck.shuffle();

        // Traditional For Loop, iterating 52x, calling draw method on each player using deck
        for (int i = 0; i < 52; i++ ) {
            if ( i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }

        // Traditional For Loop, iterating 26x, calling flip method for each player
        for (int i = 0; i < 26; i++ ) {
            System.out.println();
            System.out.println("**************ROUND" + (i + 1) + "****************");
            Card player1Card = player1.flip();
            Card player2Card = player2.flip();

        // Comparing value of each card returned by the two players flip method using getValue
        // Calling incrementScore on the player whose card has a higher value
            if (player1Card.getValue() > player2Card.getValue()) {
                System.out.println("Player 1 won this round with: ");
                player1Card.describe();
                System.out.println("VS");
                System.out.println("Player 2's card of:");
                player2Card.describe();
                player1.incrementScore();
            } else if (player1Card.getValue() < player2Card.getValue()) {
                System.out.println("Player 2 won this round with: ");
                player2Card.describe();
                System.out.println("VS");
                System.out.println("Player 1's card of:");
                player1Card.describe();
                player2.incrementScore();
            } else if (player1Card.getValue() == player2Card.getValue()) {
                System.out.println("THIS ROUND IS A DRAW!!!");
            }
            System.out.println();
        }

        // Prints out the final score and display who is the winner or a draw
        System.out.println("************FINAL SCORE**************");
        System.out.println("Player 1 score final score is = " + player1.getScore());
        System.out.println("Player 2 score final score is = " + player2.getScore());

        if (player1.getScore() > player2.getScore()) {
            System.out.println("Player 1 WINS");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println("Player 2 WINS");
        } else {
            System.out.println("DRAW");
        }

    } // Main

} // Class