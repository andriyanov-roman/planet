package planet.persistance.jpql;

import planet.entities.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by ubn-rok on 20.08.15.
 */
public class SamplesOfJpql {
    public static void main(String[] args) {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("chapter04PU");
        EntityManager entitymanager = emfactory.createEntityManager();

        //Scalar function
        Query query = entitymanager.
                createQuery("Select UPPER(e.ename) from Employee e");
        List<String> list = query.getResultList();

        for (String e : list) {
            System.out.println("Employee NAME :" + e);
        }

        //Aggregate function
        Query query1 = entitymanager.createQuery("Select MAX(e.salary) from Employee e");
        Double result = (Double) query1.getSingleResult();
        System.out.println("Max Employee Salary :" + result);
    }

    public static void betweenAndLike() {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("chapter04PU");
        EntityManager entitymanager = emfactory.createEntityManager();

        //Scalar function
        Query query = entitymanager.
                createQuery("Select UPPER(e.ename) from Employee e");
        List<String> list = query.getResultList();

        for (String e : list) {
            System.out.println("Employee NAME :" + e);
        }

        //Aggregate function
        Query query1 = entitymanager.createQuery("Select MAX(e.salary) from Employee e");
        Double result = (Double) query1.getSingleResult();
        System.out.println("Max Employee Salary :" + result);
    }

    public static void ordering() {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("chapter04PU");
        EntityManager entitymanager = emfactory.createEntityManager();

        //Between
        Query query = entitymanager.createQuery("Select e " + "from Employee e " + "ORDER BY e.ename ASC");

        List<Employee> list = (List<Employee>) query.getResultList();

        for (Employee e : list) {
            System.out.print("Employee ID :" + e.getEid());
            System.out.println("\t Employee Name :" + e.getEname());
        }
    }

    public static void namedQuery() {
        EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "chapter04PU" );
        EntityManager entitymanager = emfactory.createEntityManager();
        Query query = entitymanager.createNamedQuery("find employee by id");

        query.setParameter("id", 1204);
        List<Employee> list = query.getResultList( );

        for( Employee e:list ){
            System.out.print("Employee ID :" + e.getEid( ));
            System.out.println("\t Employee Name :" + e.getEname( ));
        }
    }
}
