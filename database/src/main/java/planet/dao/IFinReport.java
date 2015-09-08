package planet.dao;

import planet.entity.FinReport;

import java.util.ArrayList;

/**
 * Created by randriyanov on 08.09.15.
 */
public interface IFinReport {
    void doSomething();
    ArrayList<FinReport> select();
}
