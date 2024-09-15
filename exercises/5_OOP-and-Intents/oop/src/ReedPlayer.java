package src;

/**
 * Created by c4q-george on 4/30/15.
 */
public class ReedPlayer extends Musician {

    ReedInstrument myReed;

    public ReedPlayer(ReedInstrument myReed) {
        this.myReed=myReed;
    }

    public void toggleReed(){
        if(myReed.hasReed()){
            myReed.removeReed();
        }
        else
            myReed.placeReed();
    }

    @Override
    public String play_instrument() {
        return myReed.play();
    }
}
