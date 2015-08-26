package planet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Created by oleksii on 26.08.15.
 */
public class SingletonSessionFactory {
    private static SingletonSessionFactory instance;

    private SingletonSessionFactory() {

    }

    public static SingletonSessionFactory getInstance() {
        if (instance == null) {
            instance = new SingletonSessionFactory();
        }
        return instance;
    }

    private  SessionFactory createSessionFactory(){
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        SessionFactory sessionFactory = null;

        try {
            sessionFactory = configuration.buildSessionFactory(builder.build());
        }catch (Exception e) {

        }finally{
            if(!sessionFactory.isClosed()) {
                sessionFactory.close();
            }
        }

        return sessionFactory;
    }

    public static SessionFactory getSessionFactory(){
        return getInstance().createSessionFactory();
    }
}
