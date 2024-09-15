package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c4q-george on 4/29/15.
 */
public class PlayingCards extends Game {
    List<Card> deck = new ArrayList<Card>();

    @Override
    public List getPieces() {
        return deck;
    }

    public PlayingCards() {
        for(int i=0; i<52; i++){
            deck.add(new Card());
        }
    }
}
