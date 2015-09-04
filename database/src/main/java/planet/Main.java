package planet;

import org.hibernate.Session;
import planet.dao.FinReportDaoImpl;
import planet.entity.*;

import java.sql.Date;
import java.util.List;

/**
 * Created by oleksii on 09.08.15.
 */
public class Main {

    public static void main(String args[]) {

        Session session = SingletonSessionFactory.getInstance().sessionFactory.openSession();
        try{
            EntityOperation<User> uo = new EntityOperation<User>();

            User user = new User();

            user.setLogin("loginda");
            user.setPassword("passwordda");
            user.setRole(new UserRole(1, "Admin"));
            uo.add(user, session);

        }catch (Exception e) {
            System.out.println(e.getMessage());
            session.close();
            SingletonSessionFactory.closeSessionFactory();
        }finally {
            if (session != null) {
                if (session.isOpen()) {
                    session.close();
                }
            }
            SingletonSessionFactory.closeSessionFactory();
        }
    }
}
