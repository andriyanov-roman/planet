package planet.concurrency_examples.sixth_atomic;

/**
 * Created by randriyanov on 24.08.15.
 */
public class Broker extends Thread {

    private Market market;
    private static final int PAUSE = 500; // in millis

    public Broker(Market market) {
        this.market = market;
    }

    @Override

    public void run() {
        try {
            while (true) {
                System.out.println("Current index: " + market.getIndex());
                Thread.sleep(PAUSE);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
