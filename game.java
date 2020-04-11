import java.util.LinkedList;
import java.util.Random;

public class Game{
    private boolean winner;
    private LinkedList<PlayerInGame> players;
    private Deck deck;
    private LinkedList<card> community;
    private int mainPot;
    private int dealerButton;

    public Game(){
        //runs the game until winner == true
        winner = false;
        Random rand = new Random();
        dealerButton = rand.nextInt(3); //pick dealer button start location

        while(winner == false){         //*****winner being t/f needs to be a test case*****/
            int roundWinner = round();
            
            //based off round winner
            //give player winnings

            //reset pot
            //reset deck
            //move dealer button

            //check for tourney winner
        }

    }

    private static void deal(){
        /****test cases to make sure cards are coming out in order to the right players***/
        //function for dealing players their cards
    }

    private static void preflop(){
        /****test cases to make sure chip counts and pots are properly updated applies to flop, turn, etc***/
        //function for preflop betting
    }

    private static void flop(){
        //function for flop betting
    }

    private static void turn(){
        //function for turn betting
    }

    private static void river(){
        //function for river betting
    }

    private static int showdown(){
        //compares hands to see who wins
    }

    private static boolean handWon(){
        /*****test cases for only one player left in hand or multiple****/
        //checks for winner before showdown
    }

    private static int round(){
        //shuffle deck
        deal();
        if(handwon()){
            //return int of winning player
        }
        preflop();
        if(handwon()){
            //return int of winning player
        }
        flop();
        if(handwon()){
            //return int of winning player
        }
        turn();
        if(handwon()){
            //return int of winning player
        }
        river();
        if(handwon()){
            //return int of winning player
        }
        return showdown();
        /***test case to make sure proper int is being sent back****/
        /***test case to make sure money goes to correct player****/
    }

}