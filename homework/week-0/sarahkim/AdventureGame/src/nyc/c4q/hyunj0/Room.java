package nyc.c4q.hyunj0;

public abstract class Room
{
    private int capacity;

    public Room (int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }

    public int maxCapacity () {
        return 10;
    }

    public boolean exceedsMax () {
        if (this.getCapacity() > 10)
            return true;
        else
            return false;
    }

    abstract void release ();
    abstract void receive ();

}
