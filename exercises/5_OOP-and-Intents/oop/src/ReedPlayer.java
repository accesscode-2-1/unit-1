/**
 * Created by c4q-Abass on 4/30/15.
 */
abstract public class ReedPlayer extends Musician{
    ReedInstrument reedInstrument;


    public ReedPlayer(ReedInstrument x){
        this.reedInstrument= x;
    }


    @Override
    public String play_instrument() {
        if(this.reedInstrument.hasReed()){
            return this.play_instrument();
        } else
        return null;


    }
}
