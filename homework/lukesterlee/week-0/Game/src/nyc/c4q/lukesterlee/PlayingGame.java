package nyc.c4q.lukesterlee;

import nyc.c4q.lukesterlee.interfaces.Game;
import nyc.c4q.lukesterlee.rooms.Room;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luke Lee on 5/5/2015.
 */
public class PlayingGame implements Game<Room> {

    ArrayList<Room> gameWorld;

    public PlayingGame() {
        gameWorld = new ArrayList<Room>();
    }

    @Override
    public void startGame() {

    }

    @Override
    public List<Room> getSpaces() {
        return null;
    }
}
