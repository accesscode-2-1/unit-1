import java.util.ArrayList;

/**
 * Created by kadeemmaragh on 5/1/15.
 * Create an abstract class representing a game, which includes the method getpieces().
 Create a class that extends your Game class, PlayingCards.
 Create a class, Card, representing a playing card.
 In your constructor for PlayingCards, genereate a 52-deck hand of Cards. (Do not write 52 lines of code to do this). Decide an appropriate collection to store these in.
 Implement getpieces() which should return your collection of Cards. What should be the type signature for getpieces() in the abstract class?
 */
public class Main
{
    public static void main(String[] args)
    {
        PlayingCards playingCards = new PlayingCards();
        ArrayList<Card> deck = playingCards.getPieces();

        System.out.println(deck.size());

        for(Card card : deck){
            card.showCard();
            System.out.println();
        }

    }
}
