public class Animal implements Comparable {
    private String speciesName;
    private Object animal;

    public Animal(String speciesName){

    }

    public void setSpecie(String specie){
        speciesName = specie;
    }

    public String getSpecie(){
        return speciesName;
    }

    @Override
    public int compareTo(Object animal)
    {
        return 0;
    }
}

//    @Override
//    public int compareTo(Animal animal) {
//        super(speciesName);
//        if(speciesName.equals(animal.speciesName)) {
//            return speciesName.compareTo(animal.speciesName);
//        }
//        else
//            return 0;
//    }
// I am commenting this section out because it does not work and I am trying to find a way to make it work.

// I do not understand generic and will try to find the solution.
