package nyc.c4q.lukesterlee.characters;

import java.util.Random;

/**
 * Created by Luke Lee on 5/5/2015.
 */
public abstract class Character {

    private String name;
    private int level;
    private int hp;
    private int mp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public int getCurrentHp() {
        return hp;
    }

    public void increaseHp(int hp) {
        this.hp += hp;
    }

    public int getCurrentMp() {
        return mp;
    }

    public void increaseMp(int mp) {
        this.mp += mp;
    }

    public void decreaseHp(int hp) {
        this.hp -= hp;
    }

    public void decreaseMp(int mp) {
        this.mp -= mp;
    }

    public void levelUp() {
        this.level++;
    }

    public int getRandom() {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        return number;
    }
}
