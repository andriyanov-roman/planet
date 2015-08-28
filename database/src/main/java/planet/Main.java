package planet;

import org.hibernate.Session;
import planet.entity.*;

/**
 * Created by oleksii on 09.08.15.
 */
public class Main {

    public static void main(String args[]) {

        Session session = SingletonSessionFactory.getSessionFactory().openSession();
        try{
            EntityOperation<User> uo = new EntityOperation<User>();
//            User u = new User();
//            u.setLogin("customer4@shop");
//            u.setPassword("customer4@shop");
//
//            UserRole r = new UserRole();
//            r.setName("Customers");
//            r.setCode("Customer");
//            r.setId(2);
//
//            u.setRole(r);
//
//            System.out.println("Customer added");
//            uo.add(u, session);
            User u = uo.get("login","ignat@mail.ru", session);
            u.setLogin("customer_3@mail.ru");
            uo.update(u, session);
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
