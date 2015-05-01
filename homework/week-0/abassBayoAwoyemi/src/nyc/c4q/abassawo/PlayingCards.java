package nyc.c4q.abassawo;

/**
 * Created by c4q-Abass on 4/29/15.
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class PlayingCards extends Game {


    ArrayList<Card>CardDeck;
    public PlayingCards() {
        //ArrayList<String>suits = new ArrayList<String>();

         this.CardDeck = new ArrayList(52);

        //ArrayList<String>ranks = new ArrayList<String>();
        //System.out.println(ranks.size());

        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9","10", "K", "Q", "J"};
        String[] suits = {"♥", "♣", " ♦", "♠"};


        for (int z = 0; z < suits.length; z++) {
            for (int y = 0; y < ranks.length; y++) {
                this.CardDeck.add(new Card(suits[z], ranks[y]));
            }
        }

    }
        @Override
        void getPieces () {
            (for Card x : CardDeck){

            }
        }

    public static void main(String[] args) {
        (for Card x : CardDeck){

        }
    }



}


