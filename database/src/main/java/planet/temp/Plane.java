package planet.temp;

/**
 * Created by randriyanov on 03.09.15.
 */
public class Plane {
    private Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void letsFly() {
        System.out.println(engine.doStart());
    }
}
