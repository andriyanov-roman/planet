package planet.concurrency_examples.fifth_exceptions;

/**
 * Created by randriyanov on 24.08.15.
 */
public class ExceptThread extends Thread {

    public void run() {
        boolean flag = true;
        if (flag) {
            throw new RuntimeException();
        }
        System.out.println("end of ExceptThread");
    }
}
