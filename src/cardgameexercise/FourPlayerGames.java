
package cardgameexercise;

import java.util.ArrayList;


public class  FourPlayerGames implements CardGames{
    private ArrayList <String> cardGameNames;

    public FourPlayerGames() {
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
        System.out.println("The four players discuss the rules.");
    }

    @Override
    public void deal() {
        System.out.println("One of the four players deals the cards.");
    }

    @Override
    public void keepScore() {
        System.out.println("The score has four numbers, one for each player.");
    }
    
    
}
