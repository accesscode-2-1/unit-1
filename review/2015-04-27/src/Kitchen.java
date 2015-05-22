/**
 * Created by c4q-madelyntavarez on 5/1/15.
 */
public class Kitchen extends Room
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
        return true;
    }
}
