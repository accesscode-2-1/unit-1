public abstract class DomesticAnimal extends Animal implements Domestic {

    private String domesticName;

    public String getDomesticName(){
        return domesticName;
    }

    public void setDomesticName(String domesticName){
        this.domesticName = domesticName;
    }

    public DomesticAnimal(String speciesName, String domesticName){
        super(speciesName);
        this.domesticName = domesticName;
    }

    public DomesticAnimal(String speciesName){
        super(speciesName);
    }

    @Override
    public void setName()
    {

    }

    @Override
    public String getName()
    {
        return null;
    }
}
