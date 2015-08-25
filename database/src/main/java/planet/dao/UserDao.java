package planet.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import planet.entity.User;

/**
 * Created by sigen on 25.08.2015.
 */
public class UserDao {
    Configuration configuration = new Configuration().configure();
    StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
            .applySettings(configuration.getProperties());
    SessionFactory sessionFactory = null;
    Session session = null;

    public User getUserByLogin(String login){
        sessionFactory = configuration.buildSessionFactory(builder.build());
        session = sessionFactory.openSession();
        User user = (User) session.createQuery("select u from User u where u.login = :login")
                .setString("login",login)
                .uniqueResult();
        session.close();
        return user;
    }
}
