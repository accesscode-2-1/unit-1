package nyc.c4q.m47bell;

public class Main {

    public static void main(String[] args) {

        // declares an array of string
       Ship [] typesOfShips;

        // allocates memory for 3 ship objects
       typesOfShips = new Ship[3];

        // initialize the elements
        typesOfShips[0] = new Ship("Titanic","1940");
        typesOfShips[1] = new CruiseShip("Thomas","2001",345);
        typesOfShips[2] = new CargoShip("Benny","2003",3789);

       //polymorphism
        for(Ship i: typesOfShips){
            System.out.println(i);
        }

    }
}
