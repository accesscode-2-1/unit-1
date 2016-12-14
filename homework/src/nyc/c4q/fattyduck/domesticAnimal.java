package nyc.c4q.fattyduck;
/**
 * Created by fattyduck on 4/27/15.
 */
public class domesticAnimal extends Animal implements Domestic
{
    public domesticAnimal(){

    }
    public domesticAnimal(String speciesName, String name){
        this.setSpeciesName(speciesName);
        this.setName(name);
    }
    public domesticAnimal(String speciesName, String name, int age){
        super(speciesName,name,age);
    }


    @Override
    public int compareTo(Object o)
    {
        Animal other = (Animal) o;
        //I am assuming that we are comparing in desending order so A to Z is positive
        if(this.getName().charAt(0)<other.getName().charAt(0)){
            return 1;
            //I am using the getter method to keep my Animal privates, private
        }else if(this.getName()==other.getName()){
            return 0;
        }else{
            return -1;
        }
    }

    @Override
    public boolean equals(Object o){
        return this.compareTo(o)==0;
    }
}
