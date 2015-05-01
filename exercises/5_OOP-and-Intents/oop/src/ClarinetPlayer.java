package ac0430;
/**
 * Access Code 2.1
 * Ray Acevedo
 * ClarinetPlayer.java
 */
public class ClarinetPlayer extends ReedPlayer
{
    String name;
    Clarinet myClarinet;

    public ClarinetPlayer(){}

    public ClarinetPlayer(String name, Clarinet myClarinet)
    {
        this.name = name;
        this.myClarinet = myClarinet;
    }
    public void playInstrument(Clarinet myClarinet)
    {
        if(myClarinet.hasReed = false)
        {
            System.out.println();
        }
        else
        {
            System.out.println("lalalalalalala");
        }
    }

//    public void toggleReed (Clarinet myClarinet){
//        if (myClarinet.hasReed = true){
//            myClarinet.hasReed = false;
//        }
//            if(myClarinet.hasReed = false){
//                myClarinet.hasReed = true;
//            }
 //   }
    @Override
    public String play_instrument()
    {
        return null;
    }
}
