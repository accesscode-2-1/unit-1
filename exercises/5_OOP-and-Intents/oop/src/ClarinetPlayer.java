/**
 * Created by kadeemmaragh on 4/30/15.
 *
 Refactor: Create the abstract class ReedPlayer, which extends Musician. Port the functionality of ClarinetPlayer to ReedPlayer, including having the ReedPlayer keep a ReedInstrument field set in the constructor.

 Now ClarinetPlayer can inherit most of its functionality from ReedPlayer. Remove the redundant functionality but keep the constructor that takes in a Clarinet.
 */
public class ClarinetPlayer extends ReedPlayer
{

    public ClarinetPlayer(Clarinet clarinet){
        super(clarinet);

    }


}
