package planet.persistance.inheritance;

import planet.entities.Clas;
import planet.entities.Teacher;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.HashSet;
import java.util.Set;


public class ManyToManyRelation {
    public static void main(String[] args) {

        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("chapter04PU");
        EntityManager entitymanager = emfactory.createEntityManager();
        entitymanager.getTransaction().begin();

        //Create Clas Entity
        Clas clas1 = new Clas(0, "1st", null);
        Clas clas2 = new Clas(0, "2nd", null);
        Clas clas3 = new Clas(0, "3rd", null);

        //Store Clas
        entitymanager.persist(clas1);
        entitymanager.persist(clas2);
        entitymanager.persist(clas3);

        //Create Clas Set1
        Set<Clas> classSet1 = new HashSet<>();
        classSet1.add(clas1);
        classSet1.add(clas2);
        classSet1.add(clas3);

        //Create Clas Set2
        Set<Clas> classSet2 = new HashSet<>();
        classSet2.add(clas3);
        classSet2.add(clas1);
        classSet2.add(clas2);

        //Create Clas Set3
        Set<Clas> classSet3 = new HashSet<>();
        classSet3.add(clas2);
        classSet3.add(clas3);
        classSet3.add(clas1);

        //Create Teacher Entity
        Teacher teacher1 = new Teacher(0, "Gena", "Java", classSet1);
        Teacher teacher2 = new Teacher(0, "Serega", "Adv Java", classSet2);
        Teacher teacher3 = new Teacher(0, "Vitalik", "DB2", classSet3);

        //Store Teacher
        entitymanager.persist(teacher1);
        entitymanager.persist(teacher2);
        entitymanager.persist(teacher3);


        entitymanager.getTransaction().commit();
        entitymanager.close();
        emfactory.close();
    }
}
