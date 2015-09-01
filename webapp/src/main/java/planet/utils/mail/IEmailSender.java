package planet.utils.mail;
import planet.utils.Model;

/**
 * Created by sigen on 01.09.2015.
 */
public interface IEmailSender {
    public void sendEmail(String to, Model model);
}
