package nyc.c4q.lighterletter;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Ship> shipArray = new ArrayList<Ship>();

        Ship regShip = new Ship("Mary-ann","2025");
        Ship cargo = new CargoShip(230);
        Ship cruise = new CruiseShip(500);

        cargo.setShipName("The Backpack");
        cruise.setShipName("Nebulae");

        shipArray.add(regShip);
        shipArray.add(cargo);
        shipArray.add(cruise);

        System.out.println(shipArray.toString());



    }
}
