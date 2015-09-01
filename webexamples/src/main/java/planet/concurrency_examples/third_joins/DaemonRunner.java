package planet.concurrency_examples.third_joins;

/**
 * Created by randriyanov on 24.08.15.
 */
public class DaemonRunner {
    public static void main(String[ ] args) {

        SimpleThread usual = new SimpleThread();

        SimpleThread daemon = new SimpleThread();
        daemon.setDaemon(true);
        daemon.start();
        usual.start();

        System.out.println("последний оператор main");
    }
}
