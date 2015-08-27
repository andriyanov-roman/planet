package planet.concurrency_examples.fouth_synchronization;

/**
 * Created by randriyanov on 24.08.15.
 */
public class SyncThread extends Thread {

    private Resource rs;

    public SyncThread(String name, Resource rs) {
        super(name);
        this.rs = rs;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            rs.writing(getName(), i); // место срабатывания синхронизации
        }
    }
}
