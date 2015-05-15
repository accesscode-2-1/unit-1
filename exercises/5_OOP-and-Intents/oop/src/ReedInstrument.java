/**
 * Created by kadeemmaragh on 4/30/15.
 *
 *
 * Create an abstract class ReedInstrument, which implements Instrument. A ReedInstrument needs a boolean field reed, which represents if the instrument currently has a reed in it. It also needs methods, has_reed which tells us if the instrument currently has a reed, place_reed, which puts a reed on the instrument, and remove_reed which removes the reed from the instrument.

 Create the concrete class Clarinet, which inherits from ReedInstrument. Implement whatever methods need to be implemented.

 Create the concrete class ClarinetPlayer, which extends Musician. The ClarinetPlayer constructor should take in a Clarinet, and save it in a field called myClarinet. Add a method toggle_reed, which puts a reed on the Clarinet if it doesn't have one, and takes the reed off it if does. Implement the play_instrument method such that if the instrument doesn't have a reed on, it returns null, and otherwise plays the instrument sound.

 Refactor: Create the abstract class ReedPlayer, which extends Musician. Port the functionality of ClarinetPlayer to ReedPlayer, including having the ReedPlayer keep a ReedInstrument field set in the constructor.

 Now ClarinetPlayer can inherit most of its functionality from ReedPlayer. Remove the redundant functionality but keep the constructor that takes in a Clarinet.
 */
public abstract class ReedInstrument implements Instrument
{
    boolean reed;

    public boolean has_reed(){
        return this.reed;
    }
    public void place_reed(){
         reed = true;
    }

    public void remove_reed(){
        reed = false;
    }

}
