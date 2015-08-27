package planet.concurrency_examples.fifth_exceptions;

/**
 * Created by randriyanov on 24.08.15.
 */
public class ExceptionThreadDemo {
    public static void main(String[ ] args) throws InterruptedException {
        new ExceptThread().start();
        Thread.sleep(1000);
        System.out.println("end of main");

    }
}
