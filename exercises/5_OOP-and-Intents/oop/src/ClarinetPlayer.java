/**
 * Created by c4q-rosmary on 4/30/15.
 */

//Create the concrete class ClarinetPlayer, which extends Musician.
public class ClarinetPlayer<T> extends Musician
{
    protected Clarinet clarinet;


    //The ClarinetPlayer constructor should take in a Clarinet, and save it in a field called myClarinet
    public ClarinetPlayer (Clarinet clarinet) {
        this.clarinet = clarinet;

    }

    //Add a method toggle_reed, which puts a reed on the Clarinet if it doesn't have one, and takes the reed off it if does.
    public void toggle_reed(){
        if (clarinet.has_reed()) {//if true
            clarinet.remove_reed();
        } else { // if false
            clarinet.place_reed();
        }
    }

    //Implement the play_instrument method such that if the instrument doesn't have a reed on,
    // it returns null, and otherwise plays the instrument sound.
    @Override
    public String play_instrument()
    {
        if (!clarinet.has_reed()) {
            return null;
        }

        return clarinet.play();
    }
}
