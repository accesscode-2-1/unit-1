package reinardcox.c4q.nyc.horoscope;

/**
 * Created by shadowslimmedia on 5/26/15.
 */
public class PrivilegeException extends Exception {
    public PrivilegeException() {
    }

    public PrivilegeException(String message) {
        super(message);
    }

    public PrivilegeException(Throwable cause) {
        super(cause);
    }

    public PrivilegeException(String message, Throwable cause) {
        super(message, cause);
    }
}