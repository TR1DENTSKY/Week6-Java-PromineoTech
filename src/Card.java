
public class Card {

    // Creating 2 fields - Value and Name
    private int value;
    private String name;

    // Public Constructor
    public Card(int newValue, String suit) {

        value = newValue;

        switch(newValue) {
            case 2: name = "Two";
                break;
            case 3: name = "Three";
                break;
            case 4: name = "Four";
                break;
            case 5: name = "Five";
                break;
            case 6: name = "Six";
                break;
            case 7: name = "Seven";
                break;
            case 8: name = "Eight";
                break;
            case 9: name = "Nine";
                break;
            case 10: name = "Ten";
                break;
            case 11: name = "Jack";
                break;
            case 12: name = "Queen";
                break;
            case 13: name = "King";
                break;
            case 14: name = "Ace";
                break;
        }

        name += " of " + suit;
    }

    // Method to describe my card
    public void describe() {
        System.out.println(name + " and the value of " + value);
    }

    // Get and Set Methods

    // Public method to get the card name

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Public method to get the card value

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
