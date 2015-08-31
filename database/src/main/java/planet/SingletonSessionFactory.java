package planet;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Created by oleksii on 26.08.15.
 */
public class SingletonSessionFactory {
    private static volatile SingletonSessionFactory instance;
    private static SessionFactory sessionFactory;

    private SingletonSessionFactory() {

    }

    public static SingletonSessionFactory getInstance() {
        if (instance == null) {
            synchronized (SingletonSessionFactory.class){
                if (instance == null) instance = new SingletonSessionFactory();
            }
        }
        return instance;
    }

    private  SessionFactory createSessionFactory(){
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        sessionFactory = null;

        try {
            sessionFactory = configuration.buildSessionFactory(builder.build());
        }catch (Exception e) {
            sessionFactory.close();
            System.out.print(e.getMessage());
        }

        return sessionFactory;
    }

    public static void closeSessionFactory() {sessionFactory.close();}
    public static SessionFactory getSessionFactory(){
        return getInstance().createSessionFactory();
    }
}
