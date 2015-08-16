package planet.foo;

/**
 * Created by randriyanov on 15.08.15.
 */
public class DiceRoller {

    public static int rollDice() {
        return (int)
                ((Math.random(
                ) * 6) + 1);
    }

    public static String test() {
        return "Hello Gena Sipakov!!!";
    }
}