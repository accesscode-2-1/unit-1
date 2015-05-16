/**
 * Created by c4q-john on 4/30/15.
 */
public abstract class ReedPlayer extends Musician
{

    Clarinet myClarinet;

    public ReedPlayer(ReedInstrument instrument)
    {
    }

    public void toggle_reed(Clarinet myClarinet){
        if(myClarinet.has_reed()){
            myClarinet.remove_reed();
        }else if(!myClarinet.has_reed()){
            myClarinet.place_reed();
        }
    }

    public String play_instrument()
    {
        if(myClarinet.has_reed()){
            return "Play sound";
        }else

            return null;

    }


}
