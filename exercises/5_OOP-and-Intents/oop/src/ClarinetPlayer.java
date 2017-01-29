/**
 * Created by elvisboves on 4/30/15.
 */
public class ClarinetPlayer <T>extends Musician
{

    // The ClarinetPlayer constructor should take in a Clarinet,
    // and save it in a field called myClarine
    private Clarinet clarinet; // this is how you create a field

    public ClarinetPlayer (Clarinet clarinet) {
        this.clarinet = clarinet;
    }

    //Add a method toggle_reed, which puts a reed on the Clarinet if it
    //doesn't have one, and takes the reed off it if does

    public void toggle_reed () {
        if (clarinet.has_reed()) {
            clarinet.remove_reed();
        }else {
            clarinet.place_reed();
        }
    }

    @Override
    public String play_instrument()
    {
        if (!clarinet.has_reed()) {
            return null;
        }
        return clarinet.play();
    }
}
