package nyc.c4q.hyunj0;

public class Main {
    public static void main(String[] args)
    {
        Animal frankie = new Animal("Dog");
        Animal cathy = new Animal("Cat");
        Animal henry = new Animal("Hamster");
        Animal ginnie = new Animal("Gerbil");
        Animal kirin = new Animal("Giraffe");

        Animal[] animals = new Animal[]{frankie,cathy,henry,ginnie,kirin};

        Animal sugar = new Animal("Giraffe");

        for (Animal animal : animals) {
            System.out.println(animal.compareTo(sugar));
            System.out.println(animal.equals(sugar));
        }

        DomesticCat piper = new DomesticCat("Cat", "Piper");
        DomesticCat paige = new DomesticCat("Cat", "Paige");
        DomesticCat penny = new DomesticCat("Cat", "Penny");
        DomesticCat phoebe = new DomesticCat("Cat", "Phoebe");
        DomesticCat pony = new DomesticCat("Cat", "Pony");

        DomesticCat[] cats = new DomesticCat[]{piper,paige,penny,phoebe,pony};

        DomesticCat sugars = new DomesticCat("Cat", "Penny");

        for (DomesticCat animal : cats) {
            System.out.println(animal.compareTo(sugars));
            System.out.println(animal.equals(sugars));
        }

    }

}
