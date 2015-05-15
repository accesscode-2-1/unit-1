/**
 * Access Code 2.1
 * Ramona Harrison
 * ReedInstrument.java
 *
 * Create an abstract class ReedInstrument, which implements Instrument.
 * A ReedInstrument needs a boolean field reed, which represents if the instrument
 * currently has a reed in it. It also needs methods, has_reed which tells us if
 * the instrument currently has a reed, place_reed, which puts a reed on the instrument,
 * and remove_reed which removes the reed from the instrument.
 *
 */

public abstract class ReedInstrument implements Instrument {
    private boolean reed;

    public boolean hasReed() {
        return this.reed;
    }

    public void placeReed() {
        this.reed = true;
    }

    public void removeReed() {
        this.reed = false;
    }

}
