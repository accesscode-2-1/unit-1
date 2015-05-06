package com.company;

import java.util.ArrayList;

/**
 * Created by c4q-george on 4/29/15.
 */
public class Character {

    private String username;
    private int hp;

    protected Weapon currentWeapon;
    private ArrayList<Weapon> weaponInventory;
    private ArrayList<MedPack> medPackInventory;
    private ArrayList<Magazine> magazineInventory;

    private Room currentRoom;

    public void enterRoom(Room currentRoom){
        this.currentRoom=currentRoom;
    }

    public Character(String username) {
        this.username = username;
        this.hp = 100;
        // this is the inventory List
        this.weaponInventory = new ArrayList<Weapon>();
        this.medPackInventory = new ArrayList<MedPack>();
        this.magazineInventory = new ArrayList<Magazine>();
    }

    protected String getUsername(){
        return this.username;
    }

    public void showHP(){
        System.out.println("HP:"+this.getHP());
    }

    protected int getHP(){
        return this.hp;
    }

    protected void setHP(int hp){
        this.hp=hp;
    }

    public void showInventory(){
        System.out.println("");
        System.out.println("INVENTORY for "+this.getUsername());
        System.out.println("Weapons:");
        System.out.println(weaponInventory.size());
        System.out.println("MedPacks:");
        System.out.println(medPackInventory.size());
        System.out.println("Ammo:");
        System.out.println(magazineInventory.size());
        System.out.println("");
    }

    public Weapon selectWeapon(int weaponIndex){
        return weaponInventory.get(weaponIndex);
    }

    public void move(String direction){
        if(direction.equalsIgnoreCase("up")){
            currentRoom.moveUP();
        }
        else if(direction.equalsIgnoreCase("down")){
            currentRoom.moveDOWN();
        }

        else if(direction.equalsIgnoreCase("left")){
            currentRoom.moveLEFT();
        }
        else if(direction.equalsIgnoreCase("right")){
            currentRoom.moveRIGHT();
        }
        else{
            System.out.println(direction + " that doesn't make much sense.");
        }
    }

    public void pickUpWeapon(Weapon weapon){
        weaponInventory.add(weapon);
        this.currentWeapon=weapon;
    }

    public void pickUpMedPack(MedPack meds){
        medPackInventory.add(meds);
    }

    public void useMedPack(){
        if(medPackInventory.isEmpty()){
            System.out.println("You don't have any MedPacks left");
        }
        else{
            int currentHP = this.getHP();
            int currentMedPack = medPackInventory.get(medPackInventory.size() - 1).potency;
            this.setHP(currentHP+currentMedPack);
            medPackInventory.remove(medPackInventory.size() - 1);
            System.out.println("");
            System.out.println("YOU USED A MEDPACK");
            System.out.println("Your HP is now "+this.getHP());
            System.out.println("You have "+medPackInventory.size()+" MedPacks left.");
            System.out.println("");

        }
    }

    public void showPosition(){
        System.out.println("X:"+currentRoom.getX());
        System.out.println("Y:"+currentRoom.getY());
    }

    public Room getCurrentRoom(){
        return currentRoom;
    }
}
