package nyc.c4q.anthonyfermin;

public class Main {



    public static void main(String[] args) {

        Animal[] animals = {new Animal("Zebra"),new Animal("Dog"),new Animal("Cod Fish"), new Animal("Cat"), new Animal("Elephant"), new Animal("Deer")};

        System.out.println("Before Animal sort: ");
        for(Animal animal : animals)
        {
            System.out.println(animal.getSpeciesName());
        }

        Animal.sort(animals);

        System.out.println("\nAfter Animal Sort: ");
        for(Animal animal : animals)
        {
            System.out.println(animal.getSpeciesName());
        }

        DomesticCat[] cats = {new DomesticCat("Whiskers"), new DomesticCat("Furball"), new DomesticCat("Tom"), new DomesticCat("Garfield")};

        System.out.println("\nBefore Domestic Cat Sort: ");
        for(DomesticCat cat : cats){
            System.out.println(cat.getGivenName());
        }

        DomesticCat.sort(cats);

        System.out.println("\nAfter Domestic Cat Sort: ");

        for(DomesticCat cat : cats){
            System.out.println(cat.getGivenName());
        }
    }
}
