package planet.servlets;

import planet.controler.LoginController;
import planet.controler.ResponseController;

/**
 * Created by randriyanov on 09.08.15.
 */
public class ControllersHandler {

    public ResponseController getController(String name) {
        if("/login".equals(name)) {
            return new LoginController();
        }
        return null;
    }


}
