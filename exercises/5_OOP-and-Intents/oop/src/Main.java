/**
 * Created by c4q-madelyntavarez on 4/30/15.
 */
public class Main
{
    public static void main(String[] args){
        Clarinet myClarinet= new Clarinet();
        ClarinetPlayer myPlayer= new ClarinetPlayer(myClarinet);
        System.out.println(myPlayer.myClarinet.hasReed());
    }
}
