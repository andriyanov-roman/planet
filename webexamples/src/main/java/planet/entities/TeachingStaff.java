package planet.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
//this is for Type Single Table
//@DiscriminatorValue( value="TS" )
@Inheritance(strategy = InheritanceType.JOINED)
public class TeachingStaff extends Staff {
    private String qualification;
    private String subjectexpertise;

    public TeachingStaff(int sid, String sname, String qualification, String subjectexpertise) {
        super(sid, sname);
        this.qualification = qualification;
        this.subjectexpertise = subjectexpertise;
    }

    public TeachingStaff() {
        super();
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getSubjectexpertise() {
        return subjectexpertise;
    }

    public void setSubjectexpertise(String subjectexpertise) {
        this.subjectexpertise = subjectexpertise;
    }
}
