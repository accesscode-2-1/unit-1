/**
 * Created by c4q-madelyntavarez on 5/1/15.
 */
public class Bedroom extends Room
{
    @Override
    boolean hasFloor()
    {
        return true;
    }

    @Override
    String colorOfWalls(String color)
    {
        return color;
    }

    @Override
    int roomTemp(int temp)
    {
        return temp;
    }

    @Override
    boolean hasRunningWater()
    {
        return false;
    }
}
