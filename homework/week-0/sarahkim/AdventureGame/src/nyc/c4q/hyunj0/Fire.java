package nyc.c4q.hyunj0;
/**
 * Created by c4q-sarahkim on 5/2/15.
 */
public class Fire extends Room
{
    public Fire (int capacity) {
        super(capacity);
    }

    @Override
    public void release()
    {
        int release = this.getCapacity() - 2;
    }

    @Override
    void receive()
    {
        int receive = this.getCapacity() + 1;
    }
}
