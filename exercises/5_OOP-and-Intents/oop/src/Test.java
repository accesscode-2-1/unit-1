/**
 * Created by c4q-anthony-mcbride on 4/30/15.
 */
public class Test
{
    public static void main(String[] args)
    {
        Clarinet clair = new Clarinet();

        clair.place_reed();

     ClarinetPlayer John =  new ClarinetPlayer(clair);

        //John.toggle_reed();
        System.out.println(John.play_instrument());
    }
}
