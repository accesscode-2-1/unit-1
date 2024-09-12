/**
 * Created by amyquispe on 4/30/15.
 */
public interface Instrument {
    /* expected behavior: when play() is called, return a String that represents the Instrument's noise */
    public String play();
}


//Create an abstract class ReedInstrument, which implements Instrument.
//        A ReedInstrument needs a boolean field reed, which represents if the instrument
//        currently has a reed in it. It also needs methods, has_reed which tells us if
//        the instrument currently has a reed, place_reed, which puts a reed on the instrument,
//        and remove_reed which removes the reed from the instrument.