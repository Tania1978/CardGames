package cardgameexercise;

import java.util.ArrayList;


public class BettingCardGames implements CardGames {
   private ArrayList <String> cardGameNames;

    public BettingCardGames() {
          this.cardGameNames=new ArrayList<>();
    }

    public ArrayList<String> getCardGameNames() {
        return cardGameNames;
    }

    public void setCardGameNames(ArrayList<String> cardGameNames) {
        this.cardGameNames = cardGameNames;
    }

   
   
    @Override
    public void displayRules() {
        System.out.println("No matter how many players play, the rules must be clear to everyone.");
    }

    @Override
    public void deal() {
        System.out.println("One of the players, or the cazino dealer, deals the cards.");
    }

    @Override
    public void keepScore() {
        System.out.println("No score is kept for betting games. It is a lose win game.");
    }
   
   
}
