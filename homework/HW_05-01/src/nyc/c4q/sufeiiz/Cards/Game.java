package nyc.c4q.sufeiiz.Cards;

import java.util.ArrayList;

/**
 * Created by sufeizhao on 4/27/15.
 * Problem 2: Cards
 *
 * Create an abstract class representing a game, which includes the method getpieces().
 Implement getpieces() which should return your collection of Cards. What should be the type signature for getpieces() in the abstract class?
 */
public abstract class Game<E> {
    abstract ArrayList<E> getPieces();
}