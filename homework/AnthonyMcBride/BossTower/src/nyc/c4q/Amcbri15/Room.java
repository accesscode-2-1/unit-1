package nyc.c4q.Amcbri15;
/**
 * Created by c4q-anthony-mcbride on 5/1/15.
 */
public abstract class Room
{
    String levelName;
    String bossName;
    int level;

    public Room(String levelName, String bossName, int level){
        this.levelName = levelName;
        this.bossName = bossName;
        this.level = level;
    }
    public String getLevelName(){
        return this.levelName;
    }
    public String getBossName(){
        return this.bossName;
    }
    public int getLevel(){
        return this.level;
    }


}
