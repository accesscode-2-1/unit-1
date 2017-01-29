package nyc.c4q.anthonyfermin;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PlayingCards cards = new PlayingCards();

        List<Card> deck = (ArrayList) cards.getPieces();

        System.out.println("The New Deck Contains: ");
        for(Card card : deck){
            System.out.println(card.getValueName() + " of " + card.getSuit());
        }
        System.out.println("Size of Deck: " + deck.size());

    }
}
