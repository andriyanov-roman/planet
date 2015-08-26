package planet.concurrency_examples.first_run_thread;

/**
 * Created by randriyanov on 24.08.15.
 */
public class TalkThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Talking");
            try {
                Thread.sleep(7); // остановка на 7 миллисекунд
            } catch (InterruptedException e) {
                System.err.print(e);
            }
        }
    }
}
