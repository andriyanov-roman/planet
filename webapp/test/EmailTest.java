import org.junit.Test;
import planet.entity.User;
import planet.utils.Model;
import planet.utils.mail.EmailTypes;
import planet.utils.mail.IEmailSender;
import planet.utils.mail.MailFactory;

import java.util.HashMap;

/**
 * Created by sigen on 01.09.2015.
 */
public class EmailTest {
    @Test
    public void sendEmail(){
        MailFactory factory = new MailFactory();
        Model model = Model.getInstance();
        HashMap properties = new HashMap();
        User user = new User();
        user.setLogin("Gennadiy");

        properties.put("User", user);
        model.setProperties(properties);
        IEmailSender sender = factory.getEmailSender(EmailTypes.REGISTRATION.toString());
        sender.sendEmail("nightwatchftw@gmail.com",model);
    }
}
