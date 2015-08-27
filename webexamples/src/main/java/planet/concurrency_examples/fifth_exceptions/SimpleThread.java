package planet.concurrency_examples.fifth_exceptions;

/**
 * Created by randriyanov on 24.08.15.
 */
public class SimpleThread extends Thread {

    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.print(e);
        }
        System.out.println("end of SimpleThread");
    }
}
