package planet;

import planet.dao.FinReportDaoImpl;
import planet.entity.FinReport;

import java.util.Date;
import java.util.ArrayList;

import static java.lang.Thread.sleep;

/**
 * Created by oleksii on 01.09.15.
 */
public class SngltFinReport {
    private static SngltFinReport instance;
    private static volatile ArrayList<FinReport> finRep;
    private static volatile Date syncDate;
    private static volatile Thread myThread;

    private static SngltFinReport getInstance() {
        if (instance == null) {
            synchronized (SngltFinReport.class){
                if (instance == null) instance = new SngltFinReport();
            }
        }
        return instance;
    }

    private SngltFinReport() {
        createFinRepList();
    }

    private void createFinRepList(){

        myThread = new Thread(new Runnable()
        {
            public void run() //Этот метод будет выполняться в побочном потоке
            {
                while (true) {
                    FinReportDaoImpl dao = new FinReportDaoImpl();

                    finRep = dao.select();
                    syncDate = new Date();

                    try {
                        sleep(60000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        myThread.setDaemon(true);
        myThread.start();
    }

    public static ArrayList<FinReport> getFinRep() {
        getInstance();

        while(syncDate == null) {
            myThread.yield();
        }
        return finRep;
    }

    public static Date getSyncDate()
    {
        return syncDate;
    }


}
