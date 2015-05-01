package src;

/**
 * Created by c4q-george on 4/30/15.
 */
public class Main {
    public static void main(String[] args){

        Clarinet myClarino = new Clarinet();
        ClarinetPlayer joe = new ClarinetPlayer(myClarino);
        //joe.toggleReed();
        System.out.println(joe.play_instrument());
    }
}
