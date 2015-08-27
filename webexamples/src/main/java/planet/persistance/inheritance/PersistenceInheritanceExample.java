package planet.persistance.inheritance;

import planet.entities.NonTeachingStaff;
import planet.entities.TeachingStaff;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by ubn-rok on 20.08.15.
 */
public class PersistenceInheritanceExample {
    public static void main(String[] args) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("chapter04PU");
        EntityManager entitymanager = emfactory.createEntityManager();
        //Teaching staff entity
        TeachingStaff ts1 = new TeachingStaff(1, "Kolya", "MSc MEd", "Maths");
        TeachingStaff ts2 = new TeachingStaff(2, "Vitalik", "BSc BEd", "English");

        //Non-Teaching Staff entity
        NonTeachingStaff nts1 = new NonTeachingStaff(3, "Aleks", "Accounts");
        NonTeachingStaff nts2 = new NonTeachingStaff(4, "Evgen", "Office Admin");
        entitymanager.getTransaction().begin();

        //storing all entities
        entitymanager.merge(ts1);
        entitymanager.merge(ts2);
        entitymanager.merge(nts1);
        entitymanager.merge(nts2);

        entitymanager.getTransaction().commit();

        entitymanager.close();
        emfactory.close();
    }
}
