package nyc.c4q.poojawins;

import java.util.Arrays;

public class MainAnimal {

    public static void main(String[] args) {
        Animal ani1 = new Animal("Frogis maximus");
        Animal ani2 = new Animal("Canis lupis");
        Animal ani3 = new Animal("Argus malefiscent");
        Animal ani4 = new Animal("Angus deliciousness");

        Animal[] myAnimals = {ani1, ani2, ani3, ani4};
        Arrays.sort(myAnimals);
        for (Animal ani : myAnimals) {
            System.out.println(ani);
        }

        System.out.println();

        DomesticCat dc1 = new DomesticCat("psycho");
        DomesticCat dc2 = new DomesticCat("ethan");
        DomesticCat dc3 = new DomesticCat("harry");
        DomesticCat dc4 = new DomesticCat("inky");

        DomesticCat[] myDCS = {dc1, dc2, dc3, dc4};
        Arrays.sort(myDCS);
        for (DomesticCat dc : myDCS) {
            System.out.println(dc);
        }

        System.out.println();

        Animal[] allAnimals = {ani1, ani2, ani3, ani4, dc1, dc2, dc3, dc4};
        Arrays.sort(allAnimals);
        for (Animal ani : allAnimals) {
            System.out.println(ani);
        }

    }
}
