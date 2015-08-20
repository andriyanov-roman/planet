package planet.entities;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class NewsId implements Serializable{

    private String title;
    private String language;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public NewsId(String title, String language) {
        this.title = title;
        this.language = language;
    }

    public NewsId(){}
}
