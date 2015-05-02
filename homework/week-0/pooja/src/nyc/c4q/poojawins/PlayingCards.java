package nyc.c4q.poojawins;

/**
 * Created by pooja on 5/1/15.
 */

import java.util.ArrayList;

public class PlayingCards extends Game {
    private ArrayList<Card> myDeck;

    public PlayingCards() {
        String[] suits = {"hearts", "spades", "diamonds", "clubs"};
        String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        myDeck = new ArrayList<Card>();

        for (String suit : suits) {
            for (String value : values) {
                myDeck.add(new Card(suit, value));
            }
        }
    }

    @Override
    public ArrayList<Object> getPieces() {
        ArrayList<Object> myObjs = new ArrayList<Object>(myDeck);
        return myObjs;
    }

}
