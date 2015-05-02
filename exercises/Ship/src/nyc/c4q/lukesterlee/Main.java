package nyc.c4q.lukesterlee;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<Ship> harbor = new ArrayList<Ship>();

        Ship cargo1 = new CargoShip("A1", "1999", 10);
        Ship cargo2 = new CargoShip("A2", "2000", 20);
        Ship cruise1 = new CruiseShip("C1", "2013", 300);

        harbor.add(cargo1);
        harbor.add(cargo2);
        harbor.add(cruise1);

        for (Ship ship : harbor) {
            System.out.println(ship.toString());
        }

    }
}
