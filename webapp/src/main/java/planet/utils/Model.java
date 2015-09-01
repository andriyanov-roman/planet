package planet.utils;

import java.util.HashMap;

/**
 * Created by sigen on 01.09.2015.
 */
public class Model {
    static Model instace = new Model();
    private HashMap<String,? extends Object> properties;
    private String view;

    public HashMap<String, ? extends Object> getProperties() {
        return properties;
    }

    public void setProperties(HashMap<String, ? extends Object> properties) {
        this.properties = properties;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    private  Model(){}
    public static Model getInstance(){
        return instace;
    }
}
