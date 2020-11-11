
package cardgameexercise;

import java.util.ArrayList;
import java.util.Arrays;


public class CardGameExercise {

    
    public static void main(String[] args) {
        TwoCardGames gamesTwo = new TwoCardGames();
         ArrayList <String> gameNames = new ArrayList<>();
         gameNames.add("Old Maid");
         gameNames.add(" Speed");
         gameNames.add(" Slapjack");
        gamesTwo.setCardGameNames(gameNames);
        System.out.println("Some Two player card games are: " + gamesTwo.getCardGameNames());
        
        gamesTwo.shuffle();
        gamesTwo.deal();
        gamesTwo.displayRules();
        gamesTwo.keepScore();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        
        FourPlayerGames gamesFour = new FourPlayerGames();
        
        ArrayList <String> gameNames2 = new ArrayList<>();
         gameNames2.add("Switch");
         gameNames2.add(" Red Dog");
         gameNames2.add(" Crazy eights");
        gamesFour.setCardGameNames(gameNames2);
        System.out.println("Some Four player card games are: " + gamesFour.getCardGameNames());
        
        gamesFour.shuffle();
        gamesFour.deal();
        gamesFour.displayRules();
        gamesFour.keepScore();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        
        BettingCardGames gamesBet= new  BettingCardGames();
        
        ArrayList <String> gameNames3 = new ArrayList<>();
         gameNames3.add("Poker");
         gameNames3.add(" Black Jack");
         gameNames3.add(" Holdem");
        gamesBet.setCardGameNames(gameNames3);
        System.out.println("Some Four player card games are: " + gamesBet.getCardGameNames());
        
        gamesBet.shuffle();
        gamesBet.deal();
        gamesBet.displayRules();
        gamesBet.keepScore();
        
    }
    
}
