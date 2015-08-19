package planet.controler;

/**
 * Created by artem on 17.08.15.
 */
public class ControllerFactory {
    public ResponseController getController(String action){
        switch (action){
            case ("login"):
                return new LoginController();
            case("cabinet"):
                //do nothing because i can
        }
        return null;
    }
}
