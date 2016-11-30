package nyc.c4q.ramonaharrison;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Access Code 2.1
 * Ramona Harrison
 * Game.java
 *
 * Create an abstract class representing a game, which includes the method getpieces().
 * Create a class that extends your Game class, PlayingCards.
 * Create a class, Card, representing a playing card.
 * In your constructor for PlayingCards, genereate a 52-deck hand of Cards. (Do not write 52 lines of code to do this). Decide an appropriate collection to store these in.
 * Implement getpieces() which should return your collection of Cards. What should be the type signature for getpieces() in the abstract class?
 *
 */

public abstract class Game<E> {

    public ArrayList<E> getPieces(int numberOfPieces) {
        return new ArrayList<E>(numberOfPieces);
    }
}
