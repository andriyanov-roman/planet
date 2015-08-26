package planet.concurrency_examples.fouth_synchronization;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by randriyanov on 24.08.15.
 */
public class Resource {
    private FileWriter fileWriter;

    public Resource(String file) throws IOException {
        // проверка наличия файла
        fileWriter = new FileWriter(file, true);
    }

    public synchronized void writing(String str, int i) {
        try {
            fileWriter.append(str + i);
            System.out.print(str + i);
            Thread.sleep((long) (Math.random() * 50));
            fileWriter.append("->" + i + " ");
            System.out.print("->" + i + " ");
        } catch (IOException e) {
            System.err.print("ошибка файла: " + e);
        } catch (InterruptedException e) {
            System.err.print("ошибка потока: " + e);
        }
    }

    public void close() {
        try {
            fileWriter.close();
        } catch (IOException e) {
            System.err.print("ошибка закрытия файла: " + e);
        }
    }
}
