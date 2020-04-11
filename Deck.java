import java.util.ArrayList;

public class Deck {

    ArrayList<Card> cardDeck;   // The deck - an ArrayList of 52 cards.
    Card tempCard, firstCard;


    public Deck()
    {
        setDeck();
    }


    public void setDeck()
    {
        // Store all 52 cards into the cardDeck array list.
        cardDeck = new ArrayList<Card>();

        for (int i = 0; i < 52; i++)
        {
            tempCard = new Card();

            cardDeck.add(tempCard.getCard());
        }

        shuffleDeck();
    }


    public void shuffleDeck()
    {
        // Shuffles the deck
        // Ensures the deck has 52 cards before shuffling
    }


    public void resetDeck()
    {
        tempCard.resetInitializer();
        setDeck();
    }


    // Returns the first card in the deck - anchor
    public Card getFirstCard()
    {
        firstCard = cardDeck.get(0);

        cardDeck.remove(0);

        return firstCard;
    }
}
