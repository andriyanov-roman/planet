package planet.entity;

import org.hibernate.*;
import org.hibernate.criterion.Restrictions;
import planet.SingletonSessionFactory;

import java.util.List;

/**
 * Created by oleksii on 26.08.15.
 */
public class UserOperation implements EnityOperationI<User, String> {

    @Override
    public void add(User user, Session session) {
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            session.close();
        }
    }

    @Override
    public void delete(User user, Session session) {
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.delete(user);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            session.close();
        }
    }

    @Override
    public User get(String key, Session session) {
        Criteria cr = session.createCriteria(User.class);
        cr.add(Restrictions.eq("login", key));
        cr.setMaxResults(1);
        List<User> users = cr.list();

        return users.get(0);
    }

    @Override
    public void update(User user, Session session) {
        Transaction transaction = null;

        try {
            transaction = session.beginTransaction();
            session.update(user);
            transaction.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            session.close();
        }
    }
}
