package planet.entity;

import org.hibernate.Session;

/**
 * Created by oleksii on 26.08.15.
 */
public interface EnityOperationI <T, K>{
    public void add(T t, Session session);

    public void delete(T t, Session session);

    public T get(K key, Session session);

    public void update(T t, Session session);
}
