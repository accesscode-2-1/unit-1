package ac0430;
/**
 * Access Code 2.1
 * Ray Acevedo
 * Musician.java
 */
public abstract class Musician<T extends  Instrument> {
    /* expected behavior: when play_instrument() is called, return a String that represents the instrument's noise */
    public abstract String play_instrument();
}