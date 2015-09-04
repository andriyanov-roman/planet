package planet.entity;

/**
 * Created by okova on 8/15/2015.
 */

import javax.persistence.*;

@Entity
@Table(name = "user_role")
public class UserRole{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(unique = true, nullable = false)
    private String code;

    public UserRole(long id, String code) {
            this.id = id;
            this.code = code;
    }

    public UserRole(){}

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
