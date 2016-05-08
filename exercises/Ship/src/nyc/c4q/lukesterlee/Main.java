package nyc.c4q.lukesterlee;

import java.util.ArrayList;

/**
 * Access Code 2.1
 * Created by Luke Lee on 5/2/15.
 *
 * Demonstrate the classes in a program that has a Shiparray.
 * Assign various Ship, CruiseShip, and CargoShip objects to the array elements.
 * The program should then step through the array, calling each object's toString method.(use polymorphism)
 */

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
