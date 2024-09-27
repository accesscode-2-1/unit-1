package nyc.c4q.JVidals1;
/**
 * Created by s3a on 5/1/15.
 * Janneisy Vidals
 * 2.1 Accesscode
 * HW Unit 1 - Problem 2  Cards
 * Create an abstract class representing a game which includes a getpieces().
 *
 */

import java.util.Collections;
import java.util.ArrayList;

public abstract class PlayingCards extends Game
{
    @Override
    public boolean equals(Object obj)
    {
        return super.equals(obj);
    }


    public static boolean isSorted(Card[] list)
    {
        for(int i = 1; i < list.length; i++)
        {
            if(list[i - 1].compareTo(list[i]) > 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void getPieces(ArrayList cards)    //  getPieces
    { //printed cards
        for(int i = 0; i < cards.size(); i++)
        {
            System.out.println(cards.get(i));
        }
    }

    public static void main(String[] args)
    {
        Game deckofCards = new Game();
        ArrayList list = new ArrayList();
        while(deckofCards.hasNext())
        {
            list.add(deckofCards.next());
        }
        getPieces(list);
        Collections.sort(list);
        getPieces(list);
        Card[] cardList = (Card[]) list.toArray(new Card[0]);
        System.out.println("sort cards? " + isSorted(cardList));
    }

}

