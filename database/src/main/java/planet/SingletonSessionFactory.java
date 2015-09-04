package planet;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Created by oleksii on 26.08.15.
 */
public class SingletonSessionFactory {
    private static volatile SingletonSessionFactory instance;
    public static SessionFactory sessionFactory;

    private SingletonSessionFactory() {
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        sessionFactory = null;

        try {
            sessionFactory = configuration.buildSessionFactory(builder.build());
        }catch (Exception e) {
            System.out.print("Ошибка загрузки конфигурации");
            System.out.print(e.getMessage());

            sessionFactory.close();
        }
    }

    public static SingletonSessionFactory getInstance() {
        SingletonSessionFactory localInstance = instance;
        if (localInstance == null) {
            synchronized (SingletonSessionFactory.class) {
                localInstance = instance;
                if (localInstance == null) {
                    instance = localInstance = new SingletonSessionFactory();
                }
            }
        }
        return localInstance;
    }

    public static void closeSessionFactory() {sessionFactory.close();}
}
