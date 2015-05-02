package nyc.c4q.abassawo;

/**
 * Created by c4q-Abass on 4/29/15.
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class PlayingCards extends Game {


    ArrayList<Card>CardDeck;
    public PlayingCards() {

         this.CardDeck = new ArrayList(52);

        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9","10", "K", "Q", "J"};
        String[] suits = {"♥", "♣", " ♦", "♠"};


        for (int z = 0; z < suits.length; z++) {
            for (int y = 0; y < ranks.length; y++) {
                this.CardDeck.add(new Card(suits[z], ranks[y]));
            }
        }

    }


    @Override
    public ArrayList getPieces() {   //Shuffles and returns card deck
        Collections.shuffle(CardDeck);
        return CardDeck;
    }



    public void printPieces() { //Created to see actual face value of cards.
        System.out.println(CardDeck.size() + "Playing Cards");

        for(Card x : CardDeck){
            System.out.println(x.getRank() + "," + x.getSuit()); //Loop exercise print this in different lines by rank/by suit.
        }



    }


}


