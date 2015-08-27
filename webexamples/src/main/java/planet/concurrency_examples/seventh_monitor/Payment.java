package planet.concurrency_examples.seventh_monitor;

import java.util.Scanner;

/**
 * Created by randriyanov on 26.08.15.
 */
public class Payment {
    private int amount;

    private boolean close;

    public int getAmount() {
        return amount;
    }

    public boolean isClose() {
        return close;
    }

    public synchronized void doPayment() {
        try {
            System.out.println("Start payment:");
            while (amount <= 0) {
                this.wait(); // остановка потока и освобождение блокировки
                // после возврата блокировки выполнение будет продолжено
            }

// код выполнения платежа
            close = true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Payment is closed : " + close);
    }

    public void initAmount() {

        Scanner scan = new Scanner(System.in);

        amount = scan.nextInt();
    }
}
