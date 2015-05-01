/**
 * Created by c4q-anthonyf on 4/30/15.
 */
public class ClarinetPlayer extends Musician
{
    Clarinet myClarinet;

    public ClarinetPlayer(Clarinet clarinet){
        myClarinet = clarinet;
    }

    public void toggleReed(){
        if(myClarinet.has_reed()){
            myClarinet.remove_reed();
        }else{
            myClarinet.place_reed();
        }
    }

    @Override
    public String play_instrument()
    {
        if(! myClarinet.has_reed())
        return null;

        return "♩♪♬♩♬♪♫♬♩♬♪♫";
    }
}
