package planet.concurrency_examples.second_sleep_priority;

/**
 * Created by randriyanov on 24.08.15.
 */
public class PriorityRunner {
    public static void main(String[] args) {

        PriorThread min = new PriorThread("Min");

        PriorThread max = new PriorThread("Max");

        PriorThread norm = new PriorThread("Norm");

        min.setPriority(Thread.MIN_PRIORITY); // 1

        max.setPriority(Thread.MAX_PRIORITY); // 10

        norm.setPriority(Thread.NORM_PRIORITY); // 5
        min.start();
        norm.start();
        max.start();
    }
}
