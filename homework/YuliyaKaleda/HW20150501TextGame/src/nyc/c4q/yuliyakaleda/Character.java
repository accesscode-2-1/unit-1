package nyc.c4q.yuliyakaleda;

/**
 * Created by Yuliya Kaleda on 4/28/15.
 */
public abstract class Character
{

    public Character() {
    }

    void skipRoom() {
        System.out.println("You are skipping the room and moving to the next one!");
    }

    void enterRoom() {
        System.out.println("Be ready to face a challenge!");
    }

    void finishGame() {
        System.out.println("Game over!");
    }
}
