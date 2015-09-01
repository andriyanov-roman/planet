package planet.concurrency_examples.first_run_thread;

/**
 * Created by randriyanov on 24.08.15.
 */
public class WalkRunnable implements Runnable {

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println(1/0);
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }
}
