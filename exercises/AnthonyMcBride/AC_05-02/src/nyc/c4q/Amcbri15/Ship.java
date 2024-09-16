package nyc.c4q.Amcbri15;
/**
 * Created by c4q-anthony-mcbride on 5/2/15.
 */
public class Ship
{
    private String shipName;
    private int yearEst;

    public Ship(){
        this.shipName = "noname";
        this.yearEst = 0;
    }
    public Ship(String shipName, int yearEst){
        this.shipName = shipName;
        this.yearEst = yearEst;
    }
    public String getShipName(){
        return this.shipName;
    }
    public void setShipName(String shipName){
        this.shipName = shipName;
    }
    public int getYearEst(){
        return this.yearEst;
    }
    public void setYearEst(int yearEst){
        this.yearEst = yearEst;
    }
    @Override
    public String toString(){
        return "I'm a " + getClass().getName() + ".\nShip Name: " + this.shipName + "\n" + "Year Established: " + this.yearEst + "\n";
    }

}
