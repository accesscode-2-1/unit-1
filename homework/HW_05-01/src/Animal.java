public class Animal implements Comparable<Animal> {
    private String speciesName;
    private Object animal;

    public Animal(String speciesName) {

    }

    public void setSpecie(String specie)
    {
        speciesName = specie;
    }

    public String getSpecie()
    {
        return speciesName;
    }

    @Override
    public int compareTo(Animal otheranimal) {
        if(speciesName.equals(otheranimal.speciesName)){
            speciesName.compareTo(otheranimal.speciesName);
        } return  0;
    }
}
// I am commenting this section out because it does not work and I am trying to find a way to make it work.

// I do not understand generic and will try to find the solution.
