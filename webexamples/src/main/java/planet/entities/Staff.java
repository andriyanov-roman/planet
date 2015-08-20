package planet.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
@Inheritance(strategy = InheritanceType.JOINED)
//this is for Type Single Table
//@DiscriminatorColumn(name = "type")
public class Staff implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sid;
    private String sname;

    public Staff(int sid, String sname) {
        super();
        this.sid = sid;
        this.sname = sname;
    }

    public Staff() {
        super();
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
