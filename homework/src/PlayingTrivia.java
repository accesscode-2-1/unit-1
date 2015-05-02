import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * Created by Luke Lee on 5/1/2015.
 */
public class PlayingTrivia extends Game<Trivia> {

    ArrayList<Trivia> triviaDeck;

    public PlayingTrivia() {


        triviaDeck = new ArrayList<Trivia>();

    }

    public void intro() {
        System.out.println("Welcome to the game!");
        System.out.println("Choose your character : ");
    }

    public void start() {

        intro();

    }

    @Override
    ArrayList<Trivia> getPieces() {
        Collections.shuffle(triviaDeck);
        return triviaDeck;
    }
}
