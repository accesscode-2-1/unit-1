package nyc.c4q.yuliyakaleda;


/*
Testing First Exercise
 */

public class Main
{

    public static void main(String[] args)
    {

        //Test your compareTo function by creating an array of Animal instances and calling sort.
        Animal a1 = new Animal("Lion");
        Animal a2 = new Animal("Cat");
        Animal a3 = new Animal("Tiger");

        Animal[] animals = {a1, a2, a3};
        System.out.println(a1.compareTo(a2));

        //Test your compareTo function by creating an array and calling sort.
        DomesticCat fido = new DomesticCat("Cat", "Fido");
        DomesticCat mimi = new DomesticCat("Cat", "Mimi");
        DomesticCat tefi = new DomesticCat("Cat", "Tefi");

        DomesticCat[] cats = {fido, mimi, tefi};
        System.out.println(fido.compareTo(mimi));
    }
}
