import org.junit.Test;
import planet.Utils;
import planet.services.UserValidatorService;

/**
 * Created by sigen on 25.08.2015.
 */
public class UserValidatorTest {
     UserValidatorService validator = new UserValidatorService();

    @Test
    public  void checkValidator(){
        String login = "admin@shop";
        String password = "admin@shop";
        String hash = Utils.hash(password);
        System.out.println(validator.isUserValid(login,hash));
    }
}
