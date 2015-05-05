package nyc.c4q.Amcbri15;
/**
 * Created by c4q-anthony-mcbride on 5/1/15.
 */
public abstract class Weapon
{
    String type;
    int weight;

    public Weapon(String type, int weight){
        this.type = type;
        this.weight = weight;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return this.type;
    }
    public int getWeight(){
        return this.weight;
    }
}
