package planet.utils.mail.Impl;

import planet.entity.User;
import planet.utils.Model;
import planet.utils.mail.IEmailSender;
import planet.utils.mail.MailMain;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Created by sigen on 01.09.2015.
 */
public class RegistrationSender implements IEmailSender {
    @Override
    public void sendEmail(String to, Model model) {

            Session session = new MailMain().getSession();
            try {
                User user = (User) model.getProperties().get("User");
                Message message = new MimeMessage(session);
                //todo find out about shop internet address
//            message.setFrom(new InternetAddress("from-email@gmail.com"));
                message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
                //todo how to set up subject
                message.setSubject("Testing Subject");
                message.setText("Dear user, " + user.getLogin()
                        + "!\nThank you for the registration in carswap!");

                Transport.send(message);

                System.out.println("Done");

            } catch (MessagingException e) {
                throw new RuntimeException(e);
            }
    }

}
