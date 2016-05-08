package nyc.c4q.lukesterlee.interfaces;

import java.util.List;

/**
 * Created by Luke Lee on 5/5/2015.
 */
public interface Game<T> {
    void startGame();
    List<T> getSpaces();
}
