package planet.annonbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import planet.dao.IFinReport;
import planet.entity.FinReport;

import javax.annotation.Resource;
import java.util.ArrayList;

@Component
public class SeconTest {

    @Autowired
    @Qualifier("firstTest")
    private ITestInterface testInterface;

    @Resource(name = "secondTest")
    private ITestInterface secondInTestInterface;

    @Resource
    private IFinReport finReport;

    public void doSomething() {
        testInterface.printSomething();
        secondInTestInterface.printSomething();
        finReport.doSomething();
        ArrayList<FinReport> reports = finReport.select();
        System.out.println(reports.size());
    }


}
