/**
 * Created by fattyduck on 4/30/15.
 */
public class ClarinetPlayer extends reedPlayer
{
    reedInstruments clarinet = new  Clarinet() ;
    @Override
    public String play_instrument()
    {
        return "Clarinet";
    }

    public void myClarinet(Clarinet c){
        this.clarinet=c;
    }
    public void toggleReed(){
        if(this.clarinet.reed==true){
            this.clarinet.removeReed();
        }else{
            this.clarinet.placeReed();
        }
    }
}
