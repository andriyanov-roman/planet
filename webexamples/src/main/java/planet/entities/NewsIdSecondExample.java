package planet.entities;

import java.io.Serializable;

/**
 * Created by ubn-rok on 19.08.15.
 */
public class NewsIdSecondExample implements Serializable {
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
}
