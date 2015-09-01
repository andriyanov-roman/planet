package planet.concurrency_examples.first_run_thread;

import com.mchange.net.SocketUtils;

/**
 * Created by randriyanov on 24.08.15.
 */
public class WalkTalk {
    public static void main(String[] args) {
        // новые объекты потоков

        TalkThread talk = new TalkThread();
        talk.setDaemon(true);
        WalkRunnable walkRunnable = new WalkRunnable();
        walkRunnable.setEmail("email");
        Thread walk = new Thread(new WalkRunnable());

        // запуск потоков
        talk.start();
        walk.start();
        System.out.println(1/0);
        // WalkRunnable w = new WalkRunnable(); // просто объект, не поток
        // w.run(); или talk.run(); // выполнится метод, но поток не запустится!
    }

    public static void testRun(Runnable runnable) {

    }
}
