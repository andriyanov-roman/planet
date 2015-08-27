package planet.concurrency_examples.first_run_thread;

/**
 * Created by randriyanov on 24.08.15.
 */
public class HelloThread extends Thread {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        (new HelloThread()).start();
    }

}

