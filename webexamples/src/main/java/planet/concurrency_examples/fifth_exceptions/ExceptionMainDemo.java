package planet.concurrency_examples.fifth_exceptions;

/**
 * Created by randriyanov on 24.08.15.
 */
public class ExceptionMainDemo {
    public static void main(String[] args) {
        new SimpleThread().start();
        System.out.println("end of main with exception");
        throw new RuntimeException();
    }
}
