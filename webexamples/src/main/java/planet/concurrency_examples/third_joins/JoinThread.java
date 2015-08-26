package planet.concurrency_examples.third_joins;

/**
 * Created by randriyanov on 24.08.15.
 */
public class JoinThread extends Thread {
    public JoinThread(String name) {
        super(name);
    }

    public void run() {

        String nameT = getName();
        long timeout = 0;
        System.out.println("Старт потока " + nameT);
        try {
            switch (nameT) {
                case "First":
                    timeout = 5_000;
                case "Second":
                    timeout = 1_000;
            }
            Thread.sleep(timeout);
            System.out.println("завершение потока " + nameT);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
