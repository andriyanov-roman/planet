package planet;

import org.hibernate.Session;
import org.hibernate.Transaction;
import planet.entity.*;

/**
 * Created by oleksii on 09.08.15.
 */
public class Main {

    public static void main(String args[]) {
        Session session = null;
        Transaction transaction = null;

        try {
            session = SingletonSessionFactory.getSessionFactory().openSession();

            //Admin
            User u = new User();
            UserRole r = new UserRole();
            r.setName("Administrators");
            r.setCode("Admin");

            u.setLogin("admin@shop");
            u.setPassword("admin@shop");
            u.setRole(r);

            transaction = session.beginTransaction();
            session.save(r);
            session.save(u);
            transaction.commit();

            //Customer
            User u1 = new User();
            UserRole r1 = new UserRole();
            r1.setName("Customers");
            r1.setCode("Customer");

            u1.setLogin("customer1@shop");
            u1.setPassword("customer1@shop");
            u1.setRole(r1);

            transaction = session.beginTransaction();
            session.save(r1);
            session.save(u1);
            transaction.commit();

            //Product
            ProductCategory pc = new ProductCategory();
            pc.setCode("MILK");
            pc.setName("Молочко");

            Product p = new Product();
            p.setName("Простоквашино");
            p.setPrice(10.23);
            p.setCategory(pc);

            transaction = session.beginTransaction();
            session.save(pc);
            session.save(p);
            transaction.commit();

            //Order
            Order o = new Order();
            o.setUser(u1);
            o.setProduct(p);
            o.setProductQty(3);
            o.setAmount(p.getPrice() * o.getProductQty());
            o.setOrderDate();

            transaction = session.beginTransaction();
            session.save(o);

            transaction.commit();

        }catch (Exception e) {

        }finally {
            if (session != null) {
                if (session.isOpen()) {
                    session.close();
                }
            }
        }
    }

}
