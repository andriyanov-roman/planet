package planet.concurrency_examples.fouth_synchronization;

/**
 * Created by randriyanov on 24.08.15.
 */
public class Counter {
    private int c = 0;

    public void increment() {
        c++;
    }

    public void decrement() {
        c--;
    }

    public int value() {
        return c;
    }
}
