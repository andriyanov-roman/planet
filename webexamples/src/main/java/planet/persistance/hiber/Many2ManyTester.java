package planet.persistance.hiber;

import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import planet.entities.Book;

import javax.jws.soap.SOAPBinding;
import java.util.Date;
import java.util.List;

public class Many2ManyTester {
	public static void main(String[] args) {
		// loads configuration and mappings
		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		SessionFactory sessionFactory = null;
		Session session = null;
		Transaction transaction = null;
		Book book = new Book("H2G2",12.5F,"Автостопом по Галактике",
				"1-84023-742-2", 354, false);

		try {
			sessionFactory = configuration.buildSessionFactory(builder.build());
			session = sessionFactory.openSession();
			//String hql = "FROM Employee E WHERE E.id = 10";
			Criteria criteria = session.createCriteria(Book.class);
			criteria.add(Restrictions.eq("price", 100));
			transaction = session.beginTransaction();
			session.save(book);
			transaction.commit();
		}catch (Exception e) {

		}finally {
			if(session.isOpen()) {
				session.close();
			}
			if(!sessionFactory.isClosed()) {
				sessionFactory.close();
			}
 		}
	}


}
