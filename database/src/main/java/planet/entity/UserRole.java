package planet.entity;

/**
 * Created by okova on 8/15/2015.
 */
public class UserRole extends SuperEntity {
    private String code;
    private String name;

    public UserRole(String code, String name) {
            this.code = code;
            this.name = name;
    }

    public UserRole(){}

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
