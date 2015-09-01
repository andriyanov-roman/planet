package planet.utils.mail;

import java.util.Properties;

import javax.mail.PasswordAuthentication;
import javax.mail.Session;

/**
 * Created by sigen on 01.09.2015.
 */
public class MailMain {

    final static String username = "carswap1@gmail.com";
    final static String password = "carswap01";
    Session session = initializeSession();

    private static Session initializeSession() {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(username, password);
                    }
                });
        return session;
    }

    public Session getSession() {
        return this.session;
    }

}
