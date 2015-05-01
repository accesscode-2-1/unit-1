/**
 * Created by c4q-madelyntavarez on 4/30/15.
 */
public class Clarinet extends ReedInstrument
{
    @Override
    boolean hasReed()
    {
    if(reed=true){
        return true;
    }
        return false;
    }

    @Override
    void placeReed()
    {
        reed=true;
    }

    @Override
    void removeReed()
    { reed=false;

    }
}
