public class Card {

    private String rank;      //2-10,J,Q,K,A, this is string so we can output Jack, Queen, King, and Ace
    private String suit;      //clubs, diamonds, hearts, spades

    int initializer = 0;     // used to get the next card in the text file
    Card tempCard;

    public Card()
    {
        // take in the first card from the text file of 52 cards, uses initializer

        String tempRank = "Ace";       // Ace to be replaced with value from text file
        String tempSuit = "Spades";     // Spades to be replaced with value from text file

        initializer++;

        tempCard = new Card(tempRank, tempSuit);
    }


    public Card(String rank, String suit)
    {
        this.rank = rank;
        this.suit = suit;
    }


    public void resetInitializer()
    {
        initializer = 0;
        // Used when resetting the deck.
    }


    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }





    public Card getCard() {
        return tempCard;
    }
}

