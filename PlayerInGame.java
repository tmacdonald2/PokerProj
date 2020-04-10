import java.util.LinkedList;

public class PlayerInGame {
	private LinkedList<card> twoCardHand;
	private LinkedList<card> fiveCardHand;
	private chipCount;

	// Constructor: Sets chipCount and the two card hand the player has
	public PlayerInGame(LinkedList<card> playerHand, int count){

	}

	//
	public LinkedList<card> getTwoCardHand() {
		return 2CardHand;
	}

	//
	public int getChipCount() {
		return chipCount;
	}

	//
	public void addChips(int chips) {

	}


	/******* This function needs to be tested using JUnit, add to Test Plan *******/
	public void setBestFiveCardHand(LinkedList<card> hand) {
		// Takes in the community 5 card hand as a paramater and sets the players fiveCardHand to
		// the best 5 card hand the player can have using the 2 cards hand they currently have
	}

	//
	public LinkedList<card> getFiveCardHand() {
		return fiveCardHand;
	}

	//
	public void check() {

	}

	//
	public void hold() {

	}

	//
	public void bet() {

	}

	//
	public void call() {

	}

}
