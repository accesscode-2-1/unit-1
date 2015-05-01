/**
 * Created by c4q-rosmary on 4/30/15.
 */

//Create the concrete class Clarinet, which inherits from ReedInstrument.
public class Clarinet extends ReedInstrument
{

    @Override
    boolean has_reed()
    {
        return true;
    }

    @Override
    void place_reed()
    {

    }

    @Override
    void remove_reed()
    {

    }

    @Override
    public String play()
    {
        return "*Clarinet Sound* ";
    }
}
