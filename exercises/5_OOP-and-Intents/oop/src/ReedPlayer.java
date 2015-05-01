/**
 * Created by kadeemmaragh on 4/30/15.
 */
public abstract class ReedPlayer extends Musician
{
    ReedInstrument myReedInstrument;

    public ReedPlayer(ReedInstrument instrum){
        myReedInstrument = instrum;

    }

    public boolean toggle_reed(){
        if(myReedInstrument.has_reed() != true){
            myReedInstrument.place_reed();
        }
        else{
            myReedInstrument.remove_reed();
        }

        return true; //Always return true.
    }

    @Override
    public String play_instrument()
    {
        if(myReedInstrument.has_reed() != true){
            return null;
        }
        else
        {
            return myReedInstrument.play();
        }
    }
}
