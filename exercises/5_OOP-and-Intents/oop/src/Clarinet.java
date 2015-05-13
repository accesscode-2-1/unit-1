package src;

/**
 * Created by c4q-george on 4/30/15.
 */
public class Clarinet extends ReedInstrument {
    @Override
    public String play() {
        if(this.hasReed()){
            return "toooooo";
        }
        else
        return null;
    }
}
