package nyc.c4q.anthonyfermin;
import java.util.List;

/**
 * Created by c4q-anthonyf on 5/1/15.
 */
public class Room implements Renewable
{
    List<Monster> monsters;
    List<Chest> chests;

    public Room(){

    }

    @Override
    public void renew()
    {
        for(Monster monster: monsters){
            monster.reset();
        }
    }


}
