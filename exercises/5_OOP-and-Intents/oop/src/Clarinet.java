/**
 * Created by kadeemmaragh on 4/30/15.
 *
 * Create the concrete class Clarinet, which inherits from ReedInstrument. Implement whatever methods need to be implemented.

 Create the concrete class ClarinetPlayer, which extends Musician. The ClarinetPlayer constructor should take in a Clarinet, and save it in a field called myClarinet. Add a method toggle_reed, which puts a reed on the Clarinet if it doesn't have one, and takes the reed off it if does. Implement the play_instrument method such that if the instrument doesn't have a reed on, it returns null, and otherwise plays the instrument sound.

 Refactor: Create the abstract class ReedPlayer, which extends Musician. Port the functionality of ClarinetPlayer to ReedPlayer, including having the ReedPlayer keep a ReedInstrument field set in the constructor.

 Now ClarinetPlayer can inherit most of its functionality from ReedPlayer. Remove the redundant functionality but keep the constructor that takes in a Clarinet.
 */
public class Clarinet extends ReedInstrument
{

    @Override
    public String play()
    {
        return "Soothing clarinet sounds";
    }


}
