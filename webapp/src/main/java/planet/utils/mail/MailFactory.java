package planet.utils.mail;

import planet.utils.mail.Impl.*;

/**
 * Created by sigen on 01.09.2015.
 */
public class MailFactory {
    public IEmailSender getEmailSender(String type) {
        switch (type) {
            case ("REGISTRATION"):
                return new RegistrationSender();
            case ("NOTIFICATION"):
                return new NotificationSender();
            case ("SERVICE"):
                return new ServiceSender();
        }
        return null;
    }

}


