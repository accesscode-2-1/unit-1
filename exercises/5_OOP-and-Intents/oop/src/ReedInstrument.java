/**
 * Created by c4q-rosmary on 4/30/15.
 */

//Create an abstract class ReedInstrument, which implements Instrument.
public abstract class ReedInstrument implements Instrument
{
    //A ReedInstrument needs a boolean field reed, which represents if the instrument currently has a reed in it.
    boolean reed;

    //It also needs methods, has_reed which tells us if the instrument currently has a reed,
    abstract boolean has_reed ();

    //place_reed, which puts a reed on the instrument,
    abstract void place_reed ();


    //and remove_reed which removes the reed from the instrument
    abstract void remove_reed ();
}
