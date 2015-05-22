/**
 * Created by c4q-madelyntavarez on 5/1/15.
 */
abstract class Character
{
    String name;
    int numOfLegs;

    abstract int numOfLegs(int legs);
    abstract String nameOfChar(String name);
    abstract boolean canFly();
    abstract boolean HasWeapon();

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setNumOfLegs(int numOfLegs){
        this.numOfLegs=numOfLegs;
    }
    public int getNumOfLegs(){
        return numOfLegs;
    }
}
