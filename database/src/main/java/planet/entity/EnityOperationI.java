package planet.entity;

/**
 * Created by oleksii on 26.08.15.
 */
public interface EnityOperationI <T, K>{
    public void add(T t);

    public void delete(T t);

    public T get(K key);

    public void update(T t);
}
