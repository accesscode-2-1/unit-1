import java.util.AbstractCollection;

/**
 * Created by c4q-madelyntavarez on 5/1/15.
 */
abstract class Weapon implements Exists
{
    String sound;
    int numOfTimesWeaponCanBeUsed;

    abstract boolean isDeadly();
    abstract int numOfTimesWeaponCanBeUsed(int num);
    abstract String soundWhenOwnerIsDefeated(String sound);

    public void setSound(String sound){
        this.sound=sound;
    }
    public String getSound(){
        return sound;
    }
    public void setNumOfTimesWeaponCanBeUsed(int num){
        this.numOfTimesWeaponCanBeUsed=num;
    }
    public int getNumOfTimesWeaponCanBeUsed(){
        return numOfTimesWeaponCanBeUsed;
    }
}

