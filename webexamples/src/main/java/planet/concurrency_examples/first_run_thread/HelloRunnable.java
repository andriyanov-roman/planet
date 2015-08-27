package planet.concurrency_examples.first_run_thread;

/**
 * Created by randriyanov on 24.08.15.
 */
public class HelloRunnable implements Runnable {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        (new Thread(new HelloRunnable())).start();
    }

}

