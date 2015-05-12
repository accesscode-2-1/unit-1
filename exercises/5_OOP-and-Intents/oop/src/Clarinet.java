/**
 * Access Code 2.1
 * Ramona Harrison
 * Clarinet.java
 *
 * Create the concrete class Clarinet, which inherits from ReedInstrument.
 * Implement whatever methods need to be implemented.
 *
 */

public class Clarinet extends ReedInstrument{

    @Override
    public String play() {
        return "brrrrrrrrrrrrrrrrrhhgggg";
    }

    public static void main(String[] args) {

        Clarinet myClarinet = new Clarinet();
        System.out.println(myClarinet.hasReed());
        myClarinet.placeReed();
        System.out.println(myClarinet.hasReed());

    }
}
