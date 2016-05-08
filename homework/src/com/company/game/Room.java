package com.company;

import java.util.ArrayList;

/**
 * Created by c4q-george on 4/29/15.
 */
public class Room {
    //Starting position
    private int x;
    private int y;

    public Room(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveUP(){
        this.y++;
    }
    public void moveDOWN(){
        this.y--;
    }
    public void moveLEFT(){
        this.x--;
    }
    public void moveRIGHT(){
        this.x++;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
