package planet;

import org.hibernate.Session;
import org.hibernate.Transaction;
import planet.entity.*;

/**
 * Created by oleksii on 09.08.15.
 */
public class Main {

    public static void main(String args[]) {

        Session session = SingletonSessionFactory.getSessionFactory().openSession();
        try{
            UserOperation uo = new UserOperation();
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
            User u = uo.get("customer3@shop", session);
            u.setLogin("ignat@mail.ru");
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
