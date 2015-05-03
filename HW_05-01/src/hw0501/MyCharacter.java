package hw0501;
/**
 * Access Code 2.1
 * Ray Acevedo
 * MyCharacter.java
 */
public class MyCharacter extends Character
{
    public MyCharacter (){}
    public MyCharacter (String name){}
    public MyCharacter (String name, Weapon weapon, int height, int weight){}
    public void setName (String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setWeapon (Weapon weapon){this.weapon=weapon;}
    public Weapon getWeapon(){return weapon;}
    public void setHeight(int height){this.height=height;}
    public int getHeight(){return height;}
    public void setWeight(int weight){this.height=weight;}
    public int getWeight(){return weight;}
}
