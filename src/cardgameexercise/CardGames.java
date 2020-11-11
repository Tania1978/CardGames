
package cardgameexercise;


public interface CardGames {
  
  default void  shuffle(){
      System.out.println("The cards are being shuffled...");
  }
  
  void displayRules();
  void deal();
  void keepScore();

}
