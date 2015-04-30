package nyc.c4q.fattyduck;
/**
 * Created by fattyduck on 4/29/15.
 */
public interface Battle
{

    int maxhealth = 200;
    int damage = 50;
    int numOfPots = 3;


    void fight(Character c);

    void drinkPot();

    void run();




}
