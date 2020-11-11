package cardgameexercise;

import java.util.ArrayList;


public class TwoCardGames implements CardGames {
   private ArrayList <String> cardGameNames;

    public TwoCardGames() {
        this.cardGameNames=new ArrayList<>();
    }

    public ArrayList<String> getCardGameNames() {
        return cardGameNames;
    }

    public void setCardGameNames(ArrayList<String> cardGameNames) {
        this.cardGameNames = cardGameNames;
    }

    @Override
    public void deal() {
        System.out.println("One of the two players deal the cards for both.");
    }
    
    @Override
    public void displayRules() {
        System.out.println("The rules are first discussed between the two players.");
    }

    @Override
    public void keepScore() {
        System.out.println("The score has two numbers, one for each player.");
    }
}
