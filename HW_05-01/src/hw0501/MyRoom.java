package hw0501;
/**
 * Access Code 2.1
 * Ray Acevedo
 * MyRoom.java
 */
public class MyRoom extends Room
{
    public MyRoom (){}
    public MyRoom (String name){}
    public MyRoom (String name,int area){}
    public void setName (String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setArea (int area){this.area=area;}
    public int getArea(){return area;}
}
