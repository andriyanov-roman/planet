package planet.entity;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

/**
 * Created by oleksii on 28.08.15.
 */
public class EntityOperation <T>{
    public void add(T t, Session session) {
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.save(t);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            session.close();
        }
    }

    public void delete(T t, Session session) {
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.delete(t);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            session.close();
        }
    }

    public T get(String field, String key, Session session) {
        Criteria cr = session.createCriteria(User.class);
        cr.add(Restrictions.eq(field, key));
        cr.setMaxResults(1);
        List<T> users = cr.list();

        return users.get(0);
    }

    public void update(T t, Session session) {
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.update(t);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            session.close();
        }
    }
}