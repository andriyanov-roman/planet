package planet.persistance;

import planet.entities.Book;
import planet.entities.News;
import planet.entities.NewsId;

import javax.persistence.*;

/**
 * Created by ubn-rok on 18.08.15.
 */
public class PersistenceTest {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("chapter04PU");

        Book book = new Book("H2G2", 12.5F, "Автостопом по Галактике"
                , "1-84023-742-2", 354, false);
// 2. Получает EntityManager и транзакцию
        EntityManager em = emf.createEntityManager();
// 3. Обеспечивает постоянство Book в базе данных
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(book);
        tx.commit();
// 4. Выполняет именованный запрос
       Book book2 = em.createNamedQuery("findBookH2G2", Book.class).getSingleResult();
        System.out.println(book2.getDescription());
// 5. Закрывает EntityManager и EntityManagerFactory

        NewsId pk = new NewsId("Richard Wright has died on September 2008", "EN");
        News news = em.find(News.class, pk);
        em.close();
        emf.close();
    }
}
