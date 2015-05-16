package nyc.c4q.Amcbri15;
/**
 * Created by c4q-anthony-mcbride on 5/2/15.
 */
public class CruiseShip extends Ship
{
    private int peopleCapacity;

    public CruiseShip(){
        super("noname", 0);
        this.peopleCapacity = 0;
    }
    public CruiseShip(int peopleCapacity){
        super("noname", 0);
        this.peopleCapacity = peopleCapacity;
    }
    public CruiseShip(String shipName, int yearEst)
    {
        super(shipName, yearEst);
    }
    public CruiseShip(String shipName, int yearEst, int peopleCapacity)
    {
        super(shipName, yearEst);
        this.peopleCapacity = peopleCapacity;
    }
    public int getPeopleCapacity(){
        return this.peopleCapacity;
    }
    public void setPeopleCapacity(int peopleCapacity){
        this.peopleCapacity = peopleCapacity;
    }
    @Override
    public String toString(){
        return "I'm a " + getClass().getName() + ".\nShip Name: " + getShipName() + "\n" + "Passenger Capacity: " + getPeopleCapacity() + "\n";
    }

}
