package planet.concurrency_examples.eighth_simafor;

/**
 * Created by randriyanov on 26.08.15.
 */
public class ResourсeException extends Exception {

    public ResourсeException() {
        super();
    }

    public ResourсeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResourсeException(String message) {
        super(message);
    }

    public ResourсeException(Throwable cause) {
        super(cause);
    }
}
