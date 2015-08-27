package planet.concurrency_examples.third_joins;

public class JoinRunner {
    static {
        System.out.println("Старт потока main");
    }
    public static void main(String[ ] args) {
        JoinThread t1 = new JoinThread("First");
        JoinThread t2 = new JoinThread("Second");
        t1.start();
        t2.start();
        try {

            t1.join(); // поток main остановлен до окончания работы потока t1
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()); // имя текущего потока
    }
}
