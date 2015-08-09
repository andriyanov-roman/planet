package planet.entity;

/**
 * Created by oleksii on 09.08.15.
 */
public class User extends SuperEntity{
    private String login;
    private String password;

    public User(String login) {
        this.login = login;
    }

    public User(){}

    public String getLogin() {
        return login;
    }

    public void setLogin(String username) {
        this.login = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
