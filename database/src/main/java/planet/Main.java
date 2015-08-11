package planet;

import planet.dao.UserDaoImpl;
import planet.dao.interfaces_dao.CrudGeneralDao;
import planet.entity.User;

/**
 * Created by oleksii on 09.08.15.
 */
public class Main {
    public static void main(String[] args){
        CrudGeneralDao dao = new UserDaoImpl();
        User u = new User("root");
        u.setPassword("123");
        dao.insert(u);
    }

}
