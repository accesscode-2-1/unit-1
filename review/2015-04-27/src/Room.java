/**
 * Created by c4q-madelyntavarez on 5/1/15.
 */
abstract class Room implements Exists
{
    int numOfWalls;
    String colorOfWalls;
    boolean hasCeiling=true;

    abstract boolean hasFloor();
    abstract String colorOfWalls(String color);
    abstract int roomTemp(int temp);
    abstract boolean hasRunningWater();

    public void setNumOfWalls(int numOfWalls){
        this.numOfWalls=numOfWalls;
    }
    public int getNumOfWalls(){
        return numOfWalls;
    }
    public void setColorOfWalls(String colorOfWalls){
        this.colorOfWalls=colorOfWalls;
    }
    public String getColorOfWalls(){
        return colorOfWalls;
    }
}
