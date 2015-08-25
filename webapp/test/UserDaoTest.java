import org.junit.Test;
import planet.dao.UserDao;
import planet.entity.User;
import planet.services.UserValidatorService;

/**
 * Created by sigen on 25.08.2015.
 */
public class UserDaoTest {
    UserDao dao = new UserDao();
    @Test
    public void getUserTest(){
        String login = "admin@shop";
//        String password = "admin";
        User user = dao.getUserByLogin(login);
        System.out.println(user.getLogin());
        System.out.println(user.getPassword());
    }
}
