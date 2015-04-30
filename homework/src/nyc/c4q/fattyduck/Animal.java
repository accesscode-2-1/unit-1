package nyc.c4q.fattyduck;

/**
 * Created by fattyduck on 4/27/15.
 */
public class Animal implements Comparable
{
    private String speciesName = "Animal";
    private String name = "Name";
    private int age = 0;
    public Animal(){

    }
    public Animal(String speciesName, String name, int age){
        this.name = name;
        this.speciesName = speciesName;
        this.age = age;
    }

    public void setSpeciesName(String speciesName){
        this.speciesName = speciesName;
    }

    public String getSpeciesName(){
        return speciesName;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }

    @Override
    public int compareTo(Object o)
    {
        Animal other = (Animal) o;
        //I am assuming that we are comparing in desending order so A to Z is positive
        if(this.speciesName.charAt(0)<other.speciesName.charAt(0)){
            return 1;
        }else if(this.speciesName.charAt(0)==other.speciesName.charAt(0)){
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

