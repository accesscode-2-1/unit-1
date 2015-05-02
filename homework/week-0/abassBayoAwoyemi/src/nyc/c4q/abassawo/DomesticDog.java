package nyc.c4q.abassawo;

/**
 * Created by c4q-Abass on 4/30/15.
 */
public class DomesticDog extends Animal implements Domestic  {

    String name;



    @Override
    public String setName() {
        this.name = name;
       return name;
    }

    @Override
    public String getName() {

        return name;
    }

//    public Animal DomesticAnimal(String speciesName, String animalName) {
//        Animal x = new Animal();
//        this.speciesName = "canine";
//        this.name = animalName;
//        return x;
//    }


    public void setName(String name) {
        this.name = name;
    }

    public DomesticDog (String speciesName, String name ){ //Constructor for domestic anaimal that takes in species name and petname.
        this.speciesName = "Canine";
        this.name = name;
    }


    public int compareTo(DomesticDog z) {

        return this.getName().compareTo(z.getName());
    }

    public boolean equals(DomesticDog z) {
        return ((this.getName()).equals(z.getName()));
    }




}


