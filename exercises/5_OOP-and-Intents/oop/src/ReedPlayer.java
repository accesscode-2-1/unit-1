/**
 * Created by c4q-rosmary on 4/30/15.
 */

//Create the abstract class ReedPlayer, which extends Musician.
//Port the functionality of ClarinetPlayer to ReedPlayer,
// including having the ReedPlayer keep a ReedInstrument field set in the constructor.
public abstract class ReedPlayer extends Musician
{
    protected ClarinetPlayer clarinetPlayer;
    protected ReedInstrument reedInstrument;

    public ReedPlayer (ReedInstrument reedInstrument){
        this.reedInstrument = reedInstrument;
    }


}
