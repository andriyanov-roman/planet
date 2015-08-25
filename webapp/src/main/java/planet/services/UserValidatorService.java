package planet.services;

import org.apache.log4j.Logger;
import planet.dao.UserDao;
import planet.entity.User;
import planet.servlets.LoginFilter;


public class UserValidatorService {
    static final Logger log = Logger.getLogger(LoginFilter.class);
    UserDao userDao = new UserDao();

    public boolean isUserValid(String login, String pass) {
        User user =userDao.getUserByLogin(login);
        if(user.equals(null)){
            log.info("No user with name" + login);
            return false;
        }
        if (user.getPassword().equals(pass)) {
            log.info("User" + login + " is logged in successfully");
            return true;
        } else {
            log.info("Wrong password for user " + login);
            return false;
        }
    }
}
