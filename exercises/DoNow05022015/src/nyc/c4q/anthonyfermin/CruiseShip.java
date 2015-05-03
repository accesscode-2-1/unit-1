package nyc.c4q.anthonyfermin;
/**
 * Created by c4q-anthonyf on 5/2/15.
 */
public class CruiseShip extends Ship
{
    int maxPassengers;

    public CruiseShip(String name, String year, int maxPassengers)
    {
        super(name, year);
        this.maxPassengers = maxPassengers;
    }
    //accessor
    public int getMaxPassengers(){
        return maxPassengers;
    }
    //mutator
    public void setMaxPassengers(int maxPassengers){
        this.maxPassengers = maxPassengers;
    }
    @Override
    public String toString(){
        return "Name: " + getName() + " Max Passengers: " + getMaxPassengers();
    }


}
