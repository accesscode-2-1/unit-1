package nyc.c4q.hyunj0;

public abstract class Characters
{
    private String name;
    private int age;

    public Characters () {

    }

    public Characters (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName () {
        return this.name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public int getAge () {
        return this.age;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public boolean haveDice (int diceCount)
    {
        if (diceCount == 3)
            return true;
        else
            return false;
    }

    public int playCeelo (int x, int y, int z) {
        if (x == y && x == z) {
            return x;
        } else if (x == y && x != z) {
            return z;
        } else if (x != y && x == z) {
            return y;
        } else if (x != y && x != z) {

        }
        return -1;
    }
}
