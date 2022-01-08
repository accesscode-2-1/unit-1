package nyc.c4q.m47bell;
/**
 * Created by c4q-marbella on 5/2/15.
 * Access Code 2-1
 * Marbella Vidals
 */
public class Ship
{
        private String shipName;
        private String builtYear;

    public Ship(String shipName, String builtYear)
    {
        this.shipName = shipName;
        this.builtYear = builtYear;
    }

    public String getShipName()
        {
            return shipName;
        }

        public String getBuiltYear()
        {
            return builtYear;
        }

        public void setShipName(String shipName)
        {
            this.shipName = shipName;
        }

        public void setBuiltYear(String builtYear)
        {
            this.builtYear = builtYear;
        }


        @Override
        public String toString()
        {
            return "Ship name: " + getShipName() +
                    ", built year: " + getBuiltYear();
        }
}

