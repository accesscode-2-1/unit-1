package nyc.c4q.Amcbri15;
/**
 * Created by c4q-anthony-mcbride on 5/1/15.
 */
public abstract class Character
{
    String name;
    String job;
    int hp;
    boolean defeated;

    public Character(){
    }
    public Character(String name, int hp){
        this.name = name;
        this.hp = hp;
        defeated = false;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setHp(int hp){
        this.hp = hp;
    }
    public String getName(){
        return this.name;
    }
    public int getHp(){
        return this.hp;
    }
    public boolean isDefeated(){
        return this.defeated;
    }
}
