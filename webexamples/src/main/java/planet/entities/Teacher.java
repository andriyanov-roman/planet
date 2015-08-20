package planet.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Teacher {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private int tid;
    private String tname;
    private String subject;

    @ManyToMany(targetEntity = Clas.class)
    private Set clasSet;

    public Teacher(){
        super();
    }

    public Teacher(int tid, String tname, String subject, Set clasSet) {
        super();
        this.tid = tid;
        this.tname = tname;
        this.subject = subject;
        this.clasSet = clasSet;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Set getClasSet() {
        return clasSet;
    }

    public void setClasSet(Set clasSet) {
        this.clasSet = clasSet;
    }
}
