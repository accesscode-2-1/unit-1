/**
 * Created by c4q-Abass on 4/30/15.
 */
import java.util.ArrayList;
public class ClarinetPlayer extends Musician {
    Clarinet myClarinet = new Clarinet();

    public ClarinetPlayer(Clarinet x){
        this.myClarinet = x;
    }



//
//    public String play_instrument(Clarinet x) {
//        if (!(x.hasReed())){
//            return null;
//        }
//
//        return null;
//    }


    @Override
    public String play_instrument() {
        if (myClarinet.hasReed()) {
            return myClarinet.play();
        } else {
            return null;
        }
    }
}
