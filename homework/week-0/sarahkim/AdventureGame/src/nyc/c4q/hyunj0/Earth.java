package nyc.c4q.hyunj0;
/**
 * Created by c4q-sarahkim on 5/2/15.
 */
public class Earth extends Room
{
    public Earth (int capacity) {
        super(capacity);
    }

    @Override
    public void release()
    {
        int release = this.getCapacity() - 1;
    }

    @Override
    void receive()
    {
        int receive = this.getCapacity() + 1;
    }
}
