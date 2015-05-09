package nyc.c4q.sufeiiz.AnimalSort;

public class Main {

    public static void main(String[] args) {
        // Test your compareTo function by creating an array of Animal instances and calling sort.
        Animal[] animals = new Animal[2];
        animals[0] = new Animal("Tiger");
        animals[1] = new Animal("Lion");
        int sort = animals[1].compareTo(animals[0]);
        boolean equal = animals[1].equals(animals[0]);

        // Test your compareTo function by creating an array and calling sort.
        DomesticCat[] cats = new DomesticCat[2];
        cats[0] = new DomesticCat("Fluffy");
        cats[1] = new DomesticCat("Cat", "Garfield");
        int sort2 = cats[1].compareTo(cats[0]);
        boolean equal2 = cats[1].equals(cats[0]);
    }
}
