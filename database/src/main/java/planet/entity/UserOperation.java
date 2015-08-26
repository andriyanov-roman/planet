package planet.entity;

import org.hibernate.Session;
import org.hibernate.Transaction;
import planet.SingletonSessionFactory;

/**
 * Created by oleksii on 26.08.15.
 */
public class UserOperation implements EnityOperationI<User, String> {

    @Override
    public void add(User user) {
        Session session = null;
        Transaction transaction = null;

        try {
            session = SingletonSessionFactory.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
        } catch (Exception e) {
        } finally {
            if (session != null) {
                if (session.isOpen()) {
                    session.close();
                }
            }
        }
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public User get(String key) {
        return null;
    }

    @Override
    public void update(User user) {

    }
}
