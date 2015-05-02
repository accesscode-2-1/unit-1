package nyc.c4q.sufeiiz;

/**
 * Created by sufeizhao on 5/2/15.
 */
public class CruiseShip extends Ship{

    private int maxPass;

    public CruiseShip(String shipName, int year, int maxPass) {
        super(shipName, year);
        this.maxPass = maxPass;
    }

    public int getMaxPass() {
        return maxPass;
    }

    public void setMaxPass(int maxPass) {
        this.maxPass = maxPass;
    }

    @Override
    public String toString() {
        return this.getShipName() + " holds " + this.getMaxPass() + " passengers";
    }
}
