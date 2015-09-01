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
public class NotificationSender implements IEmailSender {
    @Override
    public void sendEmail(String to, Model model) {

    }
}
