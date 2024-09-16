package nyc.c4q.Amcbri15;

public class Main {

    public static void main(String[] args) {

        Ship s1 = new Ship("Unsinkable", 1950);
        Ship s2 = new Ship("Titanic 2", 1999);
        CruiseShip cs1 = new CruiseShip("Big Red Boat", 1995, 2000);
        CruiseShip cs2 = new CruiseShip("Reliable", 1997);
        cs2.setPeopleCapacity(2500);
        CargoShip cgs1 = new CargoShip(1000);
        cgs1.setShipName("Tuggah");
        Ship cgs2 = new CargoShip("Ursula", 1990, 700);
        CargoShip cgs3 = new CargoShip();

        Ship[] ships = {s1, s2, cs1, cs2, cgs1, cgs2, cgs3};

        for (Ship ship: ships){
            // By default, System.out.println calls toString
            System.out.println(ship);
        }

    }
}

