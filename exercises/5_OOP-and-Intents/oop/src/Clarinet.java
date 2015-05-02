/**
 * Created by c4q-Abass on 4/30/15.
 */
public class Clarinet extends ReedInstrument {

    @Override
    public String play() {
        return "WOMP WOMP WOMPPPPPPP";
    }

    public Clarinet() {
        this.hasReed();
    }

    public void toggleReed(){
        if (this.hasReed()){
            this.removeReed();
        } else {
            this.placeReed();
        }
    }
}
