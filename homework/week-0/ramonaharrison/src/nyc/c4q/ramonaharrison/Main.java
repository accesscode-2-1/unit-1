package nyc.c4q.ramonaharrison;

public class Main {

    public static void main(String[] args) {

        Animal cat = new Animal("Cat");
        Animal cat2 = new Animal("Cat");

        Animal dog = new Animal("Dog");
        Animal lizard = new Animal("Lizard");
        Animal mouse = new Animal("Mouse");
        Animal moose = new Animal("Moose");

        System.out.println(cat.compareTo(cat2));
        System.out.println(cat.compareTo(dog));
        System.out.println(dog.compareTo(cat));

        System.out.println(lizard.compareTo(mouse));
        System.out.println(mouse.compareTo(lizard));
        System.out.println(moose.compareTo(mouse));


    }
}