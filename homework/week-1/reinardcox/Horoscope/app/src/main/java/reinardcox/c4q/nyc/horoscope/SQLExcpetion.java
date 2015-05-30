package reinardcox.c4q.nyc.horoscope;

/**
 * Created by shadowslimmedia on 5/26/15.
 */

public class SQLExcpetion extends Exception {
    public SQLExcpetion() {
    }

    public SQLExcpetion(String message) {
        super(message);
    }

    public SQLExcpetion(Throwable cause) {
        super(cause);
    }

    public SQLExcpetion(String message, Throwable cause) {
        super(message, cause);
    }
}
