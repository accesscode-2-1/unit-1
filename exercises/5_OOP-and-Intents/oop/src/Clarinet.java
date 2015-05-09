/**
 * Created by fattyduck on 4/30/15.
 */
public class Clarinet extends reedInstruments
{
    public Clarinet(){

    }

    public Clarinet(boolean reed){
        this.reed=reed;
    }
    @Override
    public boolean hasReed()
    {
        return reed;
    }

    @Override
    public void placeReed()
    {
        reed=true;
    }

    @Override
    public void removeReed()
    {
        reed=false;
    }

    @Override
    public String play()
    {
        return null;
    }
}
