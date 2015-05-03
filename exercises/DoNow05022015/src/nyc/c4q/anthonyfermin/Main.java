package nyc.c4q.anthonyfermin;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    ArrayList<Ship> ships = new ArrayList<Ship>();
        ships.add(new CruiseShip("The Love Boat", "1979", 300));
        ships.add(new CargoShip("NYC Cargo", "1982", 40));
        ships.add(new CruiseShip("The QE 2", "1977", 250));
        ships.add(new CargoShip("LA Cargo", "1991", 45));
        ships.add(new Ship("Shippy Ship", "2000"));
        for (Ship ship: ships) {
            System.out.println(ship.toString());
        }
    }

}
