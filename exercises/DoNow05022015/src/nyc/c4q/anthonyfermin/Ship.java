package nyc.c4q.anthonyfermin;
/**
 * Created by c4q-anthonyf on 5/2/15.
 */
public class Ship
{
    String name;
    String year;

    public Ship(String name, String year){
        setName(name);
        setYear(year);
    }

    // accessors
    public String getName(){
        return name;
    }

    public String getYear(){
        return year;
    }

    // mutators
    public void setYear(String year){
        this.year = year;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){
        return "Name: " + getName() + " Year: " + getYear();
    }
}
