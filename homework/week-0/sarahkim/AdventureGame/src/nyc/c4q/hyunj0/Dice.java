package nyc.c4q.hyunj0;

import java.util.Random;

public class Dice
{
    private int side;

    public Dice () {

    }

    public int rollDice () {
        Random random = new Random();
        int outcome = random.nextInt(6)+1;
        return outcome;
    }

}
