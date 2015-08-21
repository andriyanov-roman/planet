package planet;
import javax.persistence.*;

import planet.entity.*;

/**
 * Created by oleksii on 09.08.15.
 */
public class Main {

    public static void main(String args[]) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("planet_test");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        //Admin
        User u = new User();
        UserRole r = new UserRole();
        r.setName("Administrators");
        r.setCode("Admin");

        u.setLogin("admin@shop");
        u.setPassword("admin@shop");
        u.setRole(r);

        tx.begin();
        em.persist(r);
        em.persist(u);
        tx.commit();

        //Customer
        User u1 = new User();
        UserRole r1 = new UserRole();
        r1.setName("Customers");
        r1.setCode("Customer");

        u1.setLogin("customer1@shop");
        u1.setPassword("customer1@shop");
        u1.setRole(r1);

        tx.begin();
        em.persist(r1);
        em.persist(u1);
        tx.commit();

        //Product
        ProductCategory pc = new ProductCategory();
        pc.setCode("MILK");
        pc.setName("Молочко");

        Product p = new Product();
        p.setName("Простоквашино");
        p.setPrice(10.23);
        p.setCategory(pc);

        tx.begin();
        em.persist(pc);
        em.persist(p);
        tx.commit();

        //Order
        Order o = new Order();
        o.setUser(u1);
        o.setProduct(p);
        o.setProductQty(3);
        o.setAmount(p.getPrice() * o.getProductQty());
        o.setOrderDate();

        tx.begin();
        em.persist(o);
        tx.commit();

        em.close();
        emf.close();
    }

}
