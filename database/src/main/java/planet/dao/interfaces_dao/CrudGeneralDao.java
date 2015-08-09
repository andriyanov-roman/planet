package planet.dao.interfaces_dao;

import planet.entity.SuperEntity;

import java.util.List;

/**
 * Created by oleksii on 25.07.2015.
 */
public interface CrudGeneralDao<K, T extends SuperEntity> {
    void delete(T t);

    void update(T t);

    void insert(T t);

    T select(K key);
}
