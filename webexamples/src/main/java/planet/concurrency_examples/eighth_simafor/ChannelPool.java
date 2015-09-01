package planet.concurrency_examples.eighth_simafor;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * Created by randriyanov on 26.08.15.
 */
public class ChannelPool<T> {
    private final static int POOL_SIZE = 1; // размер пула

    private final Semaphore semaphore = new Semaphore(POOL_SIZE, true);

    private final Queue<T> resources = new LinkedList<T>();

    public ChannelPool(Queue<T> source) {
        resources.addAll(source);
    }

    public T getResource(long maxWaitMillis) throws ResourсeException {
        try {
            if (semaphore.tryAcquire(maxWaitMillis, TimeUnit.MILLISECONDS)) {
                T res = resources.poll();
                return res;
            }
        } catch (InterruptedException e) {
            throw new ResourсeException(e);
        }
        throw new ResourсeException(":превышено время ожидания");
    }

    public void returnResource(T res) {
        resources.add(res); // возвращение экземпляра в пул
        semaphore.release();
    }
}
