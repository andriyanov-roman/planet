package planet.entity;

import planet.Utils;

import javax.persistence.*;

/**
 * Created by oleksii on 09.08.15.
 */
@Entity @Table(name = "user")
public class User{
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(unique = true, nullable = false)
    private String login;
    @Column(nullable = false, length = 32)
    private String password;
    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName="id", nullable = false)
    private UserRole role;

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
        this.password = Utils.hash(password);
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public String toString(){
        return "ID: "+getId()+" login: "+getLogin()+" password:"+getPassword();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
