package planet.foo;

/**
 * Created by ubn-rok on 10.08.15.
 */
public class Counter {
    private static int count;
    public static int getCount() {
        count++;
        return count;
    }
}
