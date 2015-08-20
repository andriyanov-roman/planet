package planet.entities;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(NewsIdSecondExample.class)
public class NewsSecondExample {

    @Id
    private String title;
    @Id
    private String language;
    private String content;
}
