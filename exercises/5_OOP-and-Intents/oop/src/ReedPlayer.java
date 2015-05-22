/**
 * Created by c4q-madelyntavarez on 4/30/15.
 */
abstract class ReedPlayer extends Musician
{
    ReedInstrument myInstrument;


    public ReedPlayer()
    {

    }

    public void toggleReed() {
        if(myInstrument.hasReed()){
            myInstrument.removeReed();
        }
        if(!myInstrument.hasReed()){
            myInstrument.placeReed();
        }

    }
    @Override
    public String play_instrument () {
        String music= "WHOAWHOAWHOAWHOAWHOOOOOAAAAAAA";
        return music;
    }
}


