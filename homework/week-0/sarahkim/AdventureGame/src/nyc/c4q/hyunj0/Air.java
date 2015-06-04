package nyc.c4q.hyunj0;
/**
 * Created by c4q-sarahkim on 5/2/15.
 */
public class Air extends Room
{
    public Air (int capacity) {
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
        int receive = this.getCapacity() + 2;
    }
}
