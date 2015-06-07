/**
 * Created by alvin2 on 4/30/15.
 * Alvin Kuang
 * C4Q Access Code 2.1
 */
public class ClarinetPlayer extends Musician
{
    public Clarinet myClarinet;

    public ClarinetPlayer(Clarinet clarinet) {
        this.myClarinet = clarinet;
    }


    public void toggle_read() {
        if (!myClarinet.hasReed()) {
            myClarinet.place_reed();
        } else {
            myClarinet.remove_reed();
        }
    }


    @Override
    public String play_instrument()
    {
        if (!myClarinet.hasReed())
        {
            return null;
        } else {
            return myClarinet.play();
        }
    }


}
